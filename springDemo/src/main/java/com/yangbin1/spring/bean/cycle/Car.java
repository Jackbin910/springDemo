/**  
 * @Title:  Car.java   
 * @Package com.yangbin1.spring.bean.cycle   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yangbin1
 * @date:   Sep 20, 2018 9:44:14 PM   
 */
package com.yangbin1.spring.bean.cycle;

/**   
 * @ClassName:  Car   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: yangbin1
 * @date:   Sep 20, 2018 9:44:14 PM   
 *     
 */
public class Car {
     
  @Override
  public String toString() {
    return "Car [brand=" + brand + "]";
  }

    public Car() {
       System.out.println("Car's Constructor...");
     }

    private String brand;
    
 
    
    public void init() {
      System.out.println("init...");
    }
    
    public void destroy() {
      System.out.println("destroy...");
    }

    public String getBrand() {
      return brand;
    }

    public void setBrand(String brand) {
      System.out.println("setBrand...");
      this.brand = brand;
    }
    
     
}
