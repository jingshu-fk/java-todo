package com.testcase.day20210923;
/*
@Time：2021-9-24
题目：计算5的阶乘
 */
public class TestJieChen {
    public static void main(String[] args) {
        int result = 1;
        for(int i=1;i<=5;i++){
            result *= i;
        }
        System.out.println(result);
        System.out.println(getNum(5));
    }

    public static int getNum(int n){
        if(n < 2){
            return n;
        }else {
            return n * getNum(n - 1);
        }
    }
}
