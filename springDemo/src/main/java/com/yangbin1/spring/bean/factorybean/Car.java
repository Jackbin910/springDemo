/**  
 * @Title:  Car.java   
 * @Package com.yangbin1.spring.bean.autowired   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yangbin1
 * @date:   Sep 14, 2018 4:56:34 PM   
 */
package com.yangbin1.spring.bean.factorybean;

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

  @Override
  public String toString() {
    return "Car [brand=" + brand + ", price=" + price + "]";
  }

  /**   
   * @Title:  Car   
   * @Description:    TODO(这里用一句话描述这个方法的作用)   
   * @param:  @param brand
   * @param:  @param price  
   * @throws   
   */
  public Car(String brand, double price) {
    super();
    this.brand = brand;
    this.price = price;
  }

  
}
