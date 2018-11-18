
package com.yangbin1.spring.aop.xml;


public class CalculatorImpl implements Calculator {

    @Override
    public int add(int i, int j) {
        int result = i + j;
        return result;
    }

    /**
     * <p>
     * Title: sub
     * </p>
     * <p>
     * Description:
     * </p>
     * 
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
     * <p>
     * Title: mul
     * </p>
     * <p>
     * Description:
     * </p>
     * 
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
     * <p>
     * Title: div
     * </p>
     * <p>
     * Description:
     * </p>
     * 
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
