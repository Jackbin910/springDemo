/**  
 * @Title:  Car.java   
 * @Package com.yangbin1.spring.bean.autowired   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yangbin1
 * @date:   Sep 14, 2018 4:56:34 PM   
 */
package com.yangbin1.spring.bean.spel;

/**
 * @ClassName: Car
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: yangbin1
 * @date: Sep 14, 2018 4:56:34 PM
 * 
 */
public class Car {
  private String brand;
  private double price;
  private double tyrePerimeter;

  public Car() {

  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public double getTyrePerimeter() {
    return tyrePerimeter;
  }

  public void setTyrePerimeter(double tyrePerimeter) {
    this.tyrePerimeter = tyrePerimeter;
  }

  @Override
  public String toString() {
    return "Car [brand=" + brand + ", price=" + price + ", tyrePerimeter=" + tyrePerimeter + "]";
  }

  
}
