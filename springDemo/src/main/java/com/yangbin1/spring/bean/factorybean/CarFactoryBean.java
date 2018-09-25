/**  
 * @Title:  CarFactoryBean.java   
 * @Package com.yangbin1.spring.bean.factorybean   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yangbin1
 * @date:   Sep 22, 2018 9:42:17 PM   
 */
package com.yangbin1.spring.bean.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @ClassName: CarFactoryBean
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: yangbin1
 * @date: Sep 22, 2018 9:42:17 PM
 * 
 */
public class CarFactoryBean implements FactoryBean<Car> {

    private String brand;

    /**
     * @param brand
     *            the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * <p>
     * Title: getObject
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @return
     * @throws Exception
     * @see org.springframework.beans.factory.FactoryBean#getObject()
     */
    @Override
    public Car getObject() throws Exception {
        return new Car(brand, 500000);
    }

    /**
     * <p>
     * Title: getObjectType
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @return
     * @see org.springframework.beans.factory.FactoryBean#getObjectType()
     */
    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    /**
     * <p>
     * Title: isSingleton
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @return
     * @see org.springframework.beans.factory.FactoryBean#isSingleton()
     */
    @Override
    public boolean isSingleton() {
        return true;
    }

}
