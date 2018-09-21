/**  
 * @Title:  Main.java   
 * @Package com.yangbin1.spring.bean.factory   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yangbin1
 * @date:   Sep 21, 2018 4:50:06 PM   
 */
package com.yangbin1.spring.bean.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: Main
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: yangbin1
 * @date: Sep 21, 2018 4:50:06 PM
 * 
 */
public class Main {

  /**
   * @Title: main @Description: TODO(这里用一句话描述这个方法的作用) @param: @param
   * args @return: void @throws
   */
  public static void main(String[] args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-factory.xml");
    Car car1 = (Car) ctx.getBean("car1");
    System.out.println(car1);
    
    Car car2 = (Car) ctx.getBean("car2");
    System.out.println(car2);
  }

}
