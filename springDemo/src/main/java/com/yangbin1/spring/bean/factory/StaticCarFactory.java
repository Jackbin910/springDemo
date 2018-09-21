/**  
 * @Title:  StaticCarFactory.java   
 * @Package com.yangbin1.spring.bean.factory   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yangbin1
 * @date:   Sep 21, 2018 11:02:40 AM   
 */
package com.yangbin1.spring.bean.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: StaticCarFactory
 * @Description:静态工厂方法
 * @author: yangbin1
 * @date: Sep 21, 2018 11:02:40 AM
 * 
 */
public class StaticCarFactory {
  private static Map<String, Car> cars = new HashMap<String, Car>();

  static {
    cars.put("audi", new Car("audi", 30000000));
    cars.put("bmw", new Car("bmw", 40000000));
  }

  public static Car getCar(String name) {
    return cars.get(name);
  }
}
