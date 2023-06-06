package com.effective_java;

/**
 * UncalledFor
 * @description 避免创建不必要的对象
 * @author shujingping
 * @date 2023/3/17 10:13
 * @version 1.0
 */
public class UncalledFor {
    public static void main(String[] args) {
        // 要优先使用基本类型而不是装箱基本类型，要当心无意识的自动装箱。
        Long sum = 0L;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
 
