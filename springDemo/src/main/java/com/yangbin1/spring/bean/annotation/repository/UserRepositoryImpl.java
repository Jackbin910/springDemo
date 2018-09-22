/**  
 * @Title:  UserRepositoryImpl.java   
 * @Package com.yangbin1.spring.bean.annotation.repository   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yangbin1
 * @date:   Sep 22, 2018 10:27:32 PM   
 */
package com.yangbin1.spring.bean.annotation.repository;

import org.springframework.stereotype.Repository;

    /**
     * @ClassName: UserRepositoryImpl
     * @Description:持久化层
     * @author: yangbin1
     * @date: Sep 22, 2018 10:27:32 PM
     * 
     */
    @Repository("userRepository")
    public class UserRepositoryImpl implements UserRepository {
    
        @Override
        public void save() {
            System.out.println("UserRepository save...");
        }
    
    }
