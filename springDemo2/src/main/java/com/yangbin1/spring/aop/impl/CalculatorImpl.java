/**  
 * @Title:  CalculatorImpl.java   
 * @Package com.yangbin1.spring.aop.helloworld   
 * @Description:    TODO(用一句话描述该文件做�?�?)   
 * @author: yangbin1
 * @date:   Nov 12, 2018 10:42:03 AM   
 */
package com.yangbin1.spring.aop.impl;

/**   
 * @ClassName:  CalculatorImpl   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: yangbin1
 * @date:   Nov 12, 2018 10:42:03 AM   
 *     
 */
public class CalculatorImpl implements Calculator {

    /**   
     * <p>Title: add</p>   
     * <p>Description: </p>   
     * @param i
     * @param j
     * @return   
     * @see com.yangbin1.spring.aop.helloworld.Calculator#add(int, int)   
     */
    @Override
    public int add(int i, int j) {
        int result = i + j;
        return result;
    }

    /**   
     * <p>Title: sub</p>   
     * <p>Description: </p>   
     * @param i
     * @param j
     * @return   
     * @see com.yangbin1.spring.aop.helloworld.Calculator#sub(int, int)   
     */
    @Override
    public int sub(int i, int j) {
        int result = i - j;
        return result;
    }

    /**   
     * <p>Title: mul</p>   
     * <p>Description: </p>   
     * @param i
     * @param j
     * @return   
     * @see com.yangbin1.spring.aop.helloworld.Calculator#mul(int, int)   
     */
    @Override
    public int mul(int i, int j) {

        int result = i * j;

        return result;
    }

    /**   
     * <p>Title: div</p>   
     * <p>Description: </p>   
     * @param i
     * @param j
     * @return   
     * @see com.yangbin1.spring.aop.helloworld.Calculator#div(int, int)   
     */
    @Override
    public int div(int i, int j) {

        int result = i / j;

        return result;
    }

}
