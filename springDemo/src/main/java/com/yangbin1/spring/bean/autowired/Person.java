/**  
 * @Title:  Person.java   
 * @Package com.yangbin1.spring.bean.autowired   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yangbin1
 * @date:   Sep 14, 2018 4:55:31 PM   
 */
package com.yangbin1.spring.bean.autowired;

/**
 * @ClassName: Person
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: yangbin1
 * @date: Sep 14, 2018 4:55:31 PM
 * 
 */
public class Person {
  private String name;
  private Address address;
  private Car car;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Car getCar() {
    return car;
  }

  public void setCar(Car car) {
    this.car = car;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + ", address=" + address + ", car=" + car + "]";
  }

}
