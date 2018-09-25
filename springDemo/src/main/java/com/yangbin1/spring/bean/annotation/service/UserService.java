/**  
 * @Title:  UserService.java   
 * @Package com.yangbin1.spring.bean.annotation.service   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yangbin1
 * @date:   Sep 22, 2018 10:29:27 PM   
 */
package com.yangbin1.spring.bean.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.yangbin1.spring.bean.annotation.repository.UserRepository;

    /**
     * @ClassName: UserService
     * @Description:业33
     * @author: yangbin1
     * @date: Sep 22, 2018 10:29:27 PM
     * 
     */
    @Service
    public class UserService {
        
        @Autowired
        @Qualifier("userRepositoryImpl")
        private UserRepository userRepository;
        
        public void add() {
            System.out.println("UserService add...");
            userRepository.save();
        }
    }
