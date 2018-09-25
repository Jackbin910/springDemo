/**  
 * @Title:  Address.java   
 * @Package com.yangbin1.spring.bean.autowired   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yangbin1
 * @date:   Sep 14, 2018 4:56:54 PM   
 */
package com.yangbin1.spring.bean.spel;

/**
 * @ClassName: Address
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: yangbin1
 * @date: Sep 14, 2018 4:56:54 PM
 * 
 */
public class Address {
  @Override
  public String toString() {
    return "Address [city=" + city + ", street=" + street + "]";
  }

  private String city;
  private String street;

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }


  
}
