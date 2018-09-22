/**  
 * @Title:  UserService.java   
 * @Package com.yangbin1.spring.bean.annotation.service   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yangbin1
 * @date:   Sep 22, 2018 10:29:27 PM   
 */
package com.yangbin1.spring.bean.annotation.service;

import org.springframework.stereotype.Service;

    /**
     * @ClassName: UserService
     * @Description:业务层
     * @author: yangbin1
     * @date: Sep 22, 2018 10:29:27 PM
     * 
     */
    @Service
    public class UserService {
        public void add() {
            System.out.println("UserService add...");
        }
    }
