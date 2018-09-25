/**  
 * @Title:  DataSource.java   
 * @Package com.yangbin1.spring.bean.collection   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yangbin1
 * @date:   Sep 12, 2018 2:02:40 PM   
 */
package com.yangbin1.spring.bean.collection;

import java.util.Properties;

/**
 * @ClassName: DataSource
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: yangbin1
 * @date: Sep 12, 2018 2:02:40 PM
 * 
 */
public class DataSource {
  private Properties properties;

  public Properties getProperties() {
    return properties;
  }

  public void setProperties(Properties properties) {
    this.properties = properties;
  }

  @Override
  public String toString() {
    return "DataSource [properties=" + properties + "]";
  }

}
