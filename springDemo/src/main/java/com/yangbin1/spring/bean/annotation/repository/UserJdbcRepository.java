/**  
 * @Title:  UserJdbc.java   
 * @Package com.yangbin1.spring.bean.annotation.repository   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yangbin1
 * @date:   Sep 23, 2018 10:03:21 PM   
 */
package com.yangbin1.spring.bean.annotation.repository;

import org.springframework.stereotype.Repository;

/**   
 * @ClassName:  UserJdbc   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: yangbin1
 * @date:   Sep 23, 2018 10:03:21 PM   
 *     
 */
@Repository
public class UserJdbcRepository implements UserRepository {

    /**   
     * <p>Title: save</p>   
     * <p>Description: </p>      
     * @see com.yangbin1.spring.bean.annotation.repository.UserRepository#save()   
     */
    @Override
    public void save() {
        System.out.println("UserJdbcRepository save...");
    }
    
}
