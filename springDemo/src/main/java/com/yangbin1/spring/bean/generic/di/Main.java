/**  
 * @Title:  Main.java   
 * @Package com.yangbin1.spring.bean.generic.di   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yangbin1
 * @date:   Sep 23, 2018 10:54:29 PM   
 */
package com.yangbin1.spring.bean.generic.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: Main
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: yangbin1
 * @date: Sep 23, 2018 10:54:29 PM
 * 
 */
public class Main {
    /**
     * @Title: Main @Description: TODO(这里用一句话描述这个方法的作用) @param: @throws
     */
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-generic-di.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        userService.add();
    }

}
