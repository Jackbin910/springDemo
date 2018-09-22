/**  
 * @Title:  Main.java   
 * @Package com.yangbin1.spring.bean.annotation   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yangbin1
 * @date:   Sep 22, 2018 11:02:20 PM   
 */
package com.yangbin1.spring.bean.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yangbin1.spring.bean.annotation.controller.UserController;
import com.yangbin1.spring.bean.annotation.repository.UserRepository;
import com.yangbin1.spring.bean.annotation.service.UserService;

/**   
 * @ClassName:  Main   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: yangbin1
 * @date:   Sep 22, 2018 11:02:20 PM   
 *     
 */
public class Main {

    /**   
     * @Title: main   
     * @Description: TODO(这里用一句话描述这个方法的作用)   
     * @param: @param args      
     * @return: void      
     * @throws   
     */
    public static void main(String[] args) {
       ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-annotation.xml");
       TestObject to = (TestObject) ctx.getBean("testObject");
       System.out.println(to);
       
       UserController userController = (UserController) ctx.getBean("userController");
       System.out.println(userController);
       
       UserService userService = (UserService) ctx.getBean("userService");
       System.out.println(userService);

       UserRepository userRepository = (UserRepository) ctx.getBean("userRepository");
       System.out.println(userRepository);
    }

}
