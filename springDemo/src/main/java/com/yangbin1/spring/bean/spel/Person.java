/**  
 * @Title:  Person.java   
 * @Package com.yangbin1.spring.bean.autowired   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yangbin1
 * @date:   Sep 14, 2018 4:55:31 PM   
 */
package com.yangbin1.spring.bean.spel;

/**
 * @ClassName: Person
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: yangbin1
 * @date: Sep 14, 2018 4:55:31 PM
 * 
 */
public class Person {
  private String name;
  private Car car;

  private String city;
  private String info;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Car getCar() {
    return car;
  }

  public void setCar(Car car) {
    this.car = car;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + ", car=" + car + ", city=" + city + ", info=" + info + "]";
  }

}
