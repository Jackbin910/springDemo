package com.yangbin1.spring.aop.impl;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Order(1)
@Aspect
@Component
public class ValidationAspect {
    @Before("execution(public int com.yangbin1.spring.aop.impl.Calculator.*(..))")
    public void validateArgs(JoinPoint joinPoint){
        System.out.println("Validate:" + Arrays.asList(joinPoint.getArgs()));
    }
}
