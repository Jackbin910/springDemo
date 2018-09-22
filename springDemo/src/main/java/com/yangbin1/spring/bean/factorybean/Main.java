/**  
 * @Title:  Main.java   
 * @Package com.yangbin1.spring.bean.factorybean   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yangbin1
 * @date:   Sep 22, 2018 10:01:17 PM   
 */
package com.yangbin1.spring.bean.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: Main
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: yangbin1
 * @date: Sep 22, 2018 10:01:17 PM
 * 
 */
public class Main {

  /**
   * @Title: main @Description: TODO(这里用一句话描述这个方法的作用) @param: @param
   * args @return: void @throws
   */
  public static void main(String[] args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-beanFactory.xml");
    Car car = (Car) ctx.getBean("car");
    System.out.println(car);
  }

}
