/**  
 * @Title:  CalculatorImpl.java   
 * @Package com.yangbin1.spring.aop.helloworld   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yangbin1
 * @date:   Nov 12, 2018 10:42:03 AM   
 */
package com.yangbin1.spring.aop.helloworld;

/**   
 * @ClassName:  CalculatorImpl   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: yangbin1
 * @date:   Nov 12, 2018 10:42:03 AM   
 *     
 */
public class CalculatorLoggingImpl implements Calculator {

    
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
        System.out.println("The method add begins with[" + i + "," + j + "]");
        int result = i + j;
        System.out.println("The method add ends with "+ result);
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
        System.out.println("The method sub begins with[" + i + "," + j + "]");
        int result = i - j;
        System.out.println("The method sub ends with "+ result);

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
        System.out.println("The method mul begins with[" + i + "," + j + "]");

        int result = i * j;
        System.out.println("The method mul ends with "+ result);

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
        System.out.println("The method div begins with[" + i + "," + j + "]");

        int result = i / j;
        System.out.println("The method div ends with "+ result);

        return result;
    }

}
