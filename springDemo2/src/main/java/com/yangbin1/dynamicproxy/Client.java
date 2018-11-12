/**  
 * @Title:  Client.java   
 * @Package com.yangbin1.dynamicproxy   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yangbin1
 * @date:   Nov 12, 2018 2:44:19 PM   
 */
package com.yangbin1.dynamicproxy;

import java.lang.reflect.Proxy;

/**   
 * @ClassName:  Client   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: yangbin1
 * @date:   Nov 12, 2018 2:44:19 PM   
 *     
 */
public class Client {
    public static void main(String[] args) {
        Calculator cal = new CalculatorImpl();
        CalculatorHandler handler = new CalculatorHandler(cal);
        Calculator proxy = (Calculator) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                new Class[] { Calculator.class }, handler);
        int i = 1,j = 2;
        proxy.add(i, j);
     
    }
}
