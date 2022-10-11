package com.month202105.testcase;


//九九乘法表
public class TestCase01 {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++) {
            for(int j=1;j<=i;j++){
                System.out.println(i + "*" + j + "=" + i*j);
            }
        }
    }
}
