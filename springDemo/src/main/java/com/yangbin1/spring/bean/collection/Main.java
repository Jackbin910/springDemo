/**  
 * @Title:  Main.java   
 * @Package com.yangbin1.spring.beans   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yangbin1
 * @date:   Sep 6, 2018 2:33:05 PM   
 */
package com.yangbin1.spring.bean.collection;

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
//    Person person = (Person) ctx.getBean("person3");
//    System.out.println(person);

//    Person2 person2 = (Person2) ctx.getBean("person4");
//    System.out.println(person2);
//    
    // ApplicationContext ctx = new
    // ClassPathXmlApplicationContext("applicationContext.xml");
    // HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
    // System.out.println(helloWorld);
    
//    DataSource dataSource = ctx.getBean(DataSource.class);
//    System.out.println(dataSource.getProperties());
    Person person = (Person) ctx.getBean("person6");
    System.out.println(person);
  }

}
