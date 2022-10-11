package com.day0112;

//输出1-1000的质数
public class TestPrime {
    public static void main(String[] args) {
        int i,j;
        for (i=1;i<=1000;i++) {
            for (j=2;j<i;j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                System.out.println(j + " ");
            }
        }
    }
}
