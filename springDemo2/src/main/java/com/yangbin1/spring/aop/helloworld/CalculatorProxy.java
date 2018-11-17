package com.yangbin1.spring.aop.helloworld;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CalculatorProxy {
      private Calculator target;
      

    public CalculatorProxy(Calculator target) {
        super();
        this.target = target;
    }
      
    InvocationHandler h = new InvocationHandler() {
        
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("invoke begins");
            Object obj = null;
            try {
                //前置通知
                obj = method.invoke(target, args);
                //返回通知
            } catch (Exception e) {
                e.printStackTrace();
                //异常通知
            }
            //后置通知
            System.out.println("invoke ends");
            return obj;
        }
    };
        
    public Calculator getCalProxy(){
        ClassLoader loader = target.getClass().getClassLoader();
        Class[] interfaces = new Class[]{Calculator.class};
        Calculator cal = (Calculator) Proxy.newProxyInstance(loader, interfaces, h);
        return cal;
    }
      
}
