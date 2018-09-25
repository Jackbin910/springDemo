/**  
 * @Title:  HelloWorld.java   
 * @Package com.yangbin1.spring.beans   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yangbin1
 * @date:   Sep 6, 2018 11:20:05 AM   
 */
package com.yangbin1.spring.bean;


/**   
 * @ClassName:  HelloWorld   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: yangbin1
 * @date:   Sep 6, 2018 11:20:05 AM   
 *     
 */


public class HelloWorld {
  
  private String name;
  
  public void hello(){
    System.out.println("Hello" + name);
    
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}

