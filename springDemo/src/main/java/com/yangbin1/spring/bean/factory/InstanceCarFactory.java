/**  
 * @Title:  InstanceCarFactory.java   
 * @Package com.yangbin1.spring.bean.factory   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yangbin1
 * @date:   Sep 21, 2018 4:59:55 PM   
 */
package com.yangbin1.spring.bean.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: InstanceCarFactory
 * @Description:示例工厂的方法
 * @author: yangbin1
 * @date: Sep 21, 2018 4:59:55 PM
 * 
 */
public class InstanceCarFactory {
  private Map<String, Car> cars = null;

  public InstanceCarFactory() {
    cars = new HashMap<String, Car>();
    cars.put("audi", new Car("audi", 300000));
    cars.put("BMW", new Car("BMW", 400000));
  }

  public Car getCar(String name) {
    return cars.get(name);
  }
}
