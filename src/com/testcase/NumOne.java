package com.testcase;

public class NumOne {
    public static void main(String[] args) {
        f5(6);
    }
    public static void f5(int n) {
        if (n > 5) {
            System.out.println("数字不符合要求");
            return; // 表示结束f5方法，后面的语句也不会执行
        }
        System.out.println(n);
    }
}


