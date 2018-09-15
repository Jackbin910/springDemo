/**  
 * @Title:  Person.java   
 * @Package com.yangbin1.spring.bean   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yangbin1
 * @date:   Sep 11, 2018 1:32:51 PM   
 */
package com.yangbin1.spring.bean.collection;

import java.util.List;

public class Person {
  private String name;
  private int age;
  private List<Car> cars;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }


  public Person() {
 }

  public List<Car> getCars() {
    return cars;
  }

  public void setCars(List<Car> cars) {
    this.cars = cars;
  }
  
  public Person(String name, int age, List<Car> cars) {
    super();
    this.name = name;
    this.age = age;
    this.cars = cars;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + ", age=" + age + ", cars=" + cars + "]";
  }
  
  

}
