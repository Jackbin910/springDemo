/**  
 * @Title:  MyBeanPostProcessor.java   
 * @Package com.yangbin1.spring.bean.cycle   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yangbin1
 * @date:   Sep 20, 2018 10:23:37 PM   
 */
package com.yangbin1.spring.bean.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @ClassName: MyBeanPostProcessor
 * @Description:处理所有bean
 * @author: yangbin1
 * @date: Sep 20, 2018 10:23:37 PM
 * 
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    /**
     * <p>
     * Title: postProcessBeforeInitialization
     * </p>
     * <p>
     * Description:init前处理
     * </p>
     * 
     * @param bean
     *            bean本身
     * @param beanName
     * @return
     * @throws BeansException
     * @see org.springframework.beans.factory.config.BeanPostProcessor#postProcessBeforeInitialization(java.lang.Object,
     *      java.lang.String)
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitializaiton: " + beanName + ',' + beanName);
        return bean;
    }

    /**
     * <p>
     * Title: postProcessAfterInitialization
     * </p>
     * <p>
     * Description:init后处理
     * </p>
     * 
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     * @see org.springframework.beans.factory.config.BeanPostProcessor#postProcessAfterInitialization(java.lang.Object,
     *      java.lang.String)
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitializaiton: " + beanName + ',' + beanName);
        Car car = new Car();
        car.setBrand("Ford");
        return car;
    }

}
