package com.testcase.day20210923;
/*
@Time:2021-9-27
测试方法重载
 */

public class TestMaxNum {
    public static void main(String[] args) {
        System.out.println(getMaxNum(3, 7));
        System.out.println(getMaxNum(5, 7, 13));
    }

    public static int getMaxNum(int a, int b){
        return Math.max(a, b); //两个数最大值
    }

    public static int getMaxNum(int a, int b, int c){
        return Math.max(a, Math.max(b, c));
    }
}

