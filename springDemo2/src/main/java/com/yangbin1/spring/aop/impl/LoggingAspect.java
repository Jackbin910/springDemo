package com.yangbin1.spring.aop.impl;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//把这个类申明为切面，放入IOC容器里面,并申明为切面
@Aspect
@Component
public class LoggingAspect {
    
    //申明改方法是个前置通知，开始之前执行
    @Before("execution(public int com.yangbin1.spring.aop.impl.CalculatorImpl.*(int, int))")
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("The method " + methodName + " begins with " + args);
    }

}