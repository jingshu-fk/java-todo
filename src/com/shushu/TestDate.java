package com.shushu;

import java.util.Scanner;


/*
switch用法：（多分枝）1、多个条件等价；2、每个结果后，必须得有break，否则会有穿透性，后续代码也会执行；
 */
public class TestDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = scanner.nextInt();

        System.out.println("请输入月份：");
        int mon = scanner.nextInt();

        switch (mon) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("%s月应该有31天", mon);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("%s月应该有30天", mon);
                break;
            case 2:
                //判断是闰年还是平年
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.printf("%s月应该有29天", mon);
                } else {
                    System.out.printf("%s月应该有28天", mon);
                }
        }
    }
}
