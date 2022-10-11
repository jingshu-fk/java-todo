package com.xintest;

import static java.lang.Integer.MAX_VALUE;

public class DemoTest {
    public static void main(String[] args) {
        // java会自动把基本类型装箱成为包装类型
        Integer m = 10;
        Integer n = new Integer(10);
        System.out.println(m == n);
        System.out.println(m.equals(n));

        long t1 = System.currentTimeMillis();
        Long sum = 0L;
        for(int i = 0; i < MAX_VALUE; i++) {
            // 把i强转为long类型，然后sum自动拆箱为long类型。最后又自动装箱为Long给sum
            sum += i;
        }
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
    }
}
