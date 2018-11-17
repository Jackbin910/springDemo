package com.yangbin1.spring.aop.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Calculator cal = ctx.getBean(Calculator.class);
        int result = cal.add(3, 6);
        System.out.println(result);
            
        result = cal.div(12, 0);
        System.out.println(result);
    }

}
