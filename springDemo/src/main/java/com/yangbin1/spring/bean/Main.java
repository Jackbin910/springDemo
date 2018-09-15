/**  
 * @Title:  Main.java   
 * @Package com.yangbin1.spring.beans   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yangbin1
 * @date:   Sep 6, 2018 2:33:05 PM   
 */
package com.yangbin1.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: Main
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: yangbin1
 * @date: Sep 6, 2018 2:33:05 PM
 * 
 */
public class Main {

  /**
   * @Title: main @Description: TODO(这里用一句话描述这个方法的作用) @param: @param
   *         args @return: void @throws
   */
  public static void main(String[] args) {
    // 创建
    // HelloWorld helloWorld = new HelloWorld();
    // helloWorld.setName("yangbin1");
    ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    Car car = (Car) ctx.getBean("car");
    System.out.println(car);

    // ApplicationContext ctx = new
    // ClassPathXmlApplicationContext("applicationContext.xml");
    // HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
    // System.out.println(helloWorld);

    Person person = (Person) ctx.getBean("person2");
    System.out.println(person);

  }

}
