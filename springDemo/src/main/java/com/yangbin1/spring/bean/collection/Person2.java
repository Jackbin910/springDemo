/**  
 * @Title:  Person.java   
 * @Package com.yangbin1.spring.bean   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yangbin1
 * @date:   Sep 11, 2018 1:32:51 PM   
 */
package com.yangbin1.spring.bean.collection;

import java.util.Map;

public class Person2 {
  private String name;
  private int age;
  private Map<String, Car> cars;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public Map<String, Car> getCars() {
    return cars;
  }

  public void setCars(Map<String, Car> cars) {
    this.cars = cars;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Person2() {
  }

  public Person2(String name, int age, Map<String, Car> cars) {
    super();
    this.name = name;
    this.age = age;
    this.cars = cars;
  }

  @Override
  public String toString() {
    return "Person2 [name=" + name + ", age=" + age + ", cars=" + cars + "]";
  }

 

}
