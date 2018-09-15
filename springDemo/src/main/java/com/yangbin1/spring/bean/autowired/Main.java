/**  
 * @Title:  Main.java   
 * @Package com.yangbin1.spring.bean.autowired   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yangbin1
 * @date:   Sep 14, 2018 5:09:28 PM   
 */
package com.yangbin1.spring.bean.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**   
 * @ClassName:  Main   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: yangbin1
 * @date:   Sep 14, 2018 5:09:28 PM   
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
    // TODO Auto-generated method stub
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-autowire.xml");
    Person person = (Person) applicationContext.getBean("person");
    System.out.println(person);
    
  }

}
