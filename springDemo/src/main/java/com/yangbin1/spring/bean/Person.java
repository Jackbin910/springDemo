/**  
 * @Title:  Person.java   
 * @Package com.yangbin1.spring.bean   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yangbin1
 * @date:   Sep 11, 2018 1:32:51 PM   
 */
package com.yangbin1.spring.bean;

public class Person {
  private String name;
  private int age;
  private Car car;

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

  public Car getCar() {
    return car;
  }

  public void setCar(Car car) {
    this.car = car;
  }

  public Person() {
 }

  public Person(String name, int age, Car car) {
    super();
    this.name = name;
    this.age = age;
    this.car = car;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + ", age=" + age + ", car=" + car + "]";
  }
  

}
