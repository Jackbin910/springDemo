/**  
 * @Title:  UserRepositoryImpl.java   
 * @Package com.yangbin1.spring.bean.annotation.repository   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yangbin1
 * @date:   Sep 22, 2018 10:27:32 PM   
 */
package com.yangbin1.spring.bean.annotation.repository;

import static org.junit.Assert.assertFalse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yangbin1.spring.bean.annotation.TestObject;

    /**
     * @ClassName: UserRepositoryImpl
     * @Description:持久化层
     * @author: yangbin1
     * @date: Sep 22, 2018 10:27:32 PM
     * 
     */
    @Repository
    public class UserRepositoryImpl implements UserRepository {
    
        @Autowired
        private TestObject testObject;
        
        @Override
        public void save() {
            System.out.println("UserRepository save...");
            System.out.println(testObject);
        }
    
    }
