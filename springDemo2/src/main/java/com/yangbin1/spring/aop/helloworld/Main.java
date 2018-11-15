/**  
 * @Title:  Main.java   
 * @Package com.yangbin1.spring.aop.helloworld   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yangbin1
 * @date:   Nov 12, 2018 10:56:48 AM   
 */
package com.yangbin1.spring.aop.helloworld;

/**
 * @ClassName: Main
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: yangbin1
 * @date: Nov 12, 2018 10:56:48 AM
 * 
 */
public class Main {

    /**
     * @Title: main @Description: TODO(这里用一句话描述这个方法的作用) @param: @param
     * args @return: void @throws
     */
    public static void main(String[] args) {

        Calculator target = new CalculatorImpl();
        Calculator proxy = new CalculatorProxy(target).getCalProxy();        
        proxy.add(1, 4);
    }

}
