/**  
 * @Title:  CalculatorImpl.java   
 * @Package com.yangbin1.spring.aop.helloworld   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yangbin1
 * @date:   Nov 12, 2018 10:42:03 AM   
 */
package com.yangbin1.dynamicproxy;

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
    public void add() {
        System.out.println("add");
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
    public void sub() {
       System.out.println("sub");
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
    public void mul() {
        System.out.println("mul");

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
    public void div() {
        System.out.println("div");
    }

}
