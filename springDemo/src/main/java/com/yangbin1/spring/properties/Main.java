/**  
 * @Title:  Main.java   
 * @Package com.yangbin1.spring.properties   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yangbin1
 * @date:   Sep 19, 2018 9:50:52 AM   
 */
package com.yangbin1.spring.properties;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yangbin1.spring.bean.autowired.Car;

/**   
 * @ClassName:  Main   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: yangbin1
 *     
 */
public class Main {

  /**
   * @throws SQLException 
   * @Title: main @Description: TODO(这里用一句话描述这个方法的作用) @param: @param
   *         args @return: void @throws
   */
  public static void main(String[] args) throws SQLException {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-properties.xml");
    DataSource datasource = (DataSource) applicationContext.getBean("dataSource");
    System.out.println(datasource.getConnection());
  }

}
