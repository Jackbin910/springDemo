/**  
 * @Title:  Main.java   
 * @Package com.yangbin1.spring.bean.cycle   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yangbin1
 * @date:   Sep 20, 2018 9:53:10 PM   
 */
package com.yangbin1.spring.bean.cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**   
 * @ClassName:  Main   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: yangbin1
 * @date:   Sep 20, 2018 9:53:10 PM   
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
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cycle.xml");
    Car car = (Car) ctx.getBean("car");
    System.out.println(car);
    ctx.close();
  }

}
