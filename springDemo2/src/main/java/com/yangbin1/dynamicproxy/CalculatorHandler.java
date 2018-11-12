/**  
 * @Title:  CalculatorHandler.java   
 * @Package com.yangbin1.dynamicproxy   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yangbin1
 * @date:   Nov 12, 2018 2:36:57 PM   
 */
package com.yangbin1.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**   
 * @ClassName:  CalculatorHandler   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: yangbin1
 * @date:   Nov 12, 2018 2:36:57 PM   
 *     
 */
public class CalculatorHandler implements InvocationHandler{
    
    Calculator cal ;
    
    /**   
     * @Title:  CalculatorHandler   
     * @Description:    TODO(这里用一句话描述这个方法的作用)   
     * @param:    
     * @throws   
     */
    public CalculatorHandler(Calculator cal) {
        super();
        this.cal = cal;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       method.invoke(cal, args);
       return null;
    }

}
