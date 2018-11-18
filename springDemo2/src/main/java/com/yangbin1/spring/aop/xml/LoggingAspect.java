package com.yangbin1.spring.aop.xml;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;

public class LoggingAspect {
    
    
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("The method " + methodName + " begins with " + args);
    }
    
    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("The method " + methodName + " ends with " + args);
    }
 
    public void afterReturning(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("The method " + methodName + " ends with " + result);
    }
   
    public void afterThrowing(JoinPoint joinPoint, Exception ex) {
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("The method " + methodName + " occurs exception: " + ex);
    }
    
    //环绕通知需要ProceedingJoinPoint类型的参数
    //环绕通知类似于动态代理里面的全过程：ProceedingJoinPoint参数决定是否执行目标方法
    //环绕通知必须有返回值，目标方法的返回值
   /* @Around(value="execution(public int com.yangbin1.spring.aop.impl.CalculatorImpl.*(int, int))")
    public Object aroundMethod(ProceedingJoinPoint pj) {
        Object result = null;
        String methodName = pj.getSignature().getName();
        // 执行目标方法
        try {
            // 前置通知
            System.out.println("The method " + methodName + " begins with " + Arrays.asList(pj.getArgs()));
            result = pj.proceed();
            // 返回通知
            System.out.println("The method ends with " + result);
        } catch (Throwable e) {
            // 异常通知
            System.out.println("The method occurs exception " + e);
            throw new RuntimeException(e);
        }
        // 后置通知
        System.out.println("The method " + methodName + " ends");
        return result;
    }
*/
}
