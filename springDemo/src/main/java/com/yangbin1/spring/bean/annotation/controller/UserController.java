/**  
 * @Title:  UserController.java   
 * @Package com.yangbin1.spring.bean.annotation.controller   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yangbin1
 * @date:   Sep 22, 2018 10:57:28 PM   
 */
package com.yangbin1.spring.bean.annotation.controller;

import org.springframework.stereotype.Controller;

    /**
     * @ClassName: UserController
     * @Description:表现层
     * @author: yangbin1
     * @date: Sep 22, 2018 10:57:28 PM
     * 
     */
    @Controller
    public class UserController {
        public void execute() {
        System.out.println("UserController execute...");
    }
}
