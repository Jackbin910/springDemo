/**  
 * @Title:  BaseService.java   
 * @Package com.yangbin1.spring.bean.generic.di   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yangbin1
 * @date:   Sep 23, 2018 10:37:54 PM   
 */
package com.yangbin1.spring.bean.generic.di;

import org.springframework.beans.factory.annotation.Autowired;

/**   
 * @ClassName:  BaseService   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: yangbin1
 * @date:   Sep 23, 2018 10:37:54 PM   
 *     
 */
public class BaseService<T> {
    
    @Autowired
    protected BaseRepository<T> repository;
    
    public void add() {
        System.out.println("add...");
        System.out.println(repository);
    }
}
