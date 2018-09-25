/**  
 * @Title:  UserController.java   
 * @Package com.yangbin1.spring.bean.annotation.controller   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yangbin1
 * @date:   Sep 22, 2018 10:57:28 PM   
 */
package com.yangbin1.spring.bean.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.yangbin1.spring.bean.annotation.service.UserService;

    /**
     * @ClassName: UserController
     * @Description:表现层
     * @author: yangbin1
     * @date: Sep 22, 2018 10:57:28 PM
     * 
     */
    @Controller
    public class UserController {
        
        @Autowired
        private UserService userService;
        
        public void execute() {
        System.out.println("UserController execute...");
        userService.add();
    }
}
