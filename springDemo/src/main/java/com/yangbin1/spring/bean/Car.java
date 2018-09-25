/**  
 * @Title:  Car.java   
 * @Package com.yangbin1.spring.beans   
 * @Description:  测试bean Car
 * @author: yangbin1
 * @date:   Sep 6, 2018 4:52:21 PM   
 */
package com.yangbin1.spring.bean;

/**
 * @ClassName: Car
 * @Description:实体类
 * @author: yangbin1 
 */
public class Car {
  private String brand;
  private String color;
  private int price;
  private int maxSpeed;

  public Car() {
  }

  public Car(String brand, String color, int price, int maxSpeed) {
    super();
    this.brand = brand;
    this.color = color;
    this.price = price;
    this.maxSpeed = maxSpeed;
  }

  @Override
  public String toString() {
    return "Car [brand=" + brand + ", color=" + color + ", price=" + price + ", maxSpeed=" + maxSpeed + "]";
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;

  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getMaxSpeed() {
    return maxSpeed;
  }

  public void setMaxSpeed(int maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

}
