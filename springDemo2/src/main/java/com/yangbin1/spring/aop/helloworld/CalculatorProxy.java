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
            Object obj = method.invoke(target, args);
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
