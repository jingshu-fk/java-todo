/**
 * @projectName StartOne
 * @package com.xintest.javaguide
 * @className com.xintest.javaguide.Interview2
 */
package com.xintest.javaguide;

import static java.lang.Integer.MAX_VALUE;

/**
 * Interview2
 * @description 自动装箱和自动拆箱
 * @author shujingping
 * @date 2022/10/14 10:01 上午
 * @version 1.0
 */
public class Interview2 {
    public static void main(String[] args) {
        Integer v1 = 10;
        long t1 = System.currentTimeMillis();
        Long sum = 0L;
        for (int i = 0; i < MAX_VALUE; i++) {
            sum += i;
        }
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
    }
}
 
