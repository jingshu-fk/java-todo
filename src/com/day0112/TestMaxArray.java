package com.day0112;

import java.util.Scanner;

public class TestMaxArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int num = scanner.nextInt();
        decompose(num);
    }

    //将正整数分解成质因数
    public static void decompose(int num) {
        int temp = num / 2;
        for (int i=2;i<num;i++) {
            if (num % i == 0) {
                num = num / i;
                System.out.printf("质因数为：%d", i);
                i = 1;
                continue; //满足条件，结束本次循环
            }
        }
    }
}
