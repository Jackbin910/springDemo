/**  
 * @Title:  Main.java   
 * @Package com.yangbin1.spring.bean.autowired   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yangbin1
 * @date:   Sep 14, 2018 5:09:28 PM   
 */
package com.yangbin1.spring.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yangbin1.spring.bean.autowired.Address;
import com.yangbin1.spring.bean.autowired.Car;
import com.yangbin1.spring.bean.autowired.Person;

/**
 * @ClassName: Main
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: yangbin1
 */
public class Main {

  /**
   * @Title: main @Description: TODO(这里用一句话描述这个方法的作用) @param: @param
   *         args @return: void @throws
   */
  public static void main(String[] args) {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-scope.xml");
    // Address address = (Address) applicationContext.getBean("address");
    Car car = (Car) applicationContext.getBean("car");
    Car car2 = (Car) applicationContext.getBean("car");
    System.out.println(car == car2);
  }

}
