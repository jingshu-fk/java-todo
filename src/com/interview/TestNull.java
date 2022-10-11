package com.interview;

/**
 * @author SHUJINGPING
 * @date 2022-6-8
 * @description null可以赋值给引用类型
 */
public class TestNull {
    public static void main(String[] args) {
        method(null);
    }

    public static void method(Object o){
        System.out.println("Object method");
    }

    public static void method(String s) {
        System.out.println("String method");
    }
}
