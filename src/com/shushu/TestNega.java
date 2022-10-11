package com.shushu;

import java.util.Scanner;


//判断输入的5个数字是否有负数
public class TestNega {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入5个数字：");
        int flag = 0;
        int i = 1;
        while (i<=5) {
            int num = scanner.nextInt();
            if (num < 0) {
                flag += 1;
            }
            i++;
        }
        if (flag == 0) {
            System.out.println("这5个数字中没有负数");
        } else {
            System.out.println("这5个数字中有负数");
        }
    }
}
