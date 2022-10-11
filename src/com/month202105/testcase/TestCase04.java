package com.month202105.testcase;

import java.util.Scanner;

public class TestCase04 {
    public static void main(String[] args) {
        double a1 = 3.14;
        double a2 = 2.769343f;
        int a3 = 365;
        short a4 = 12;
        char a5 = '吃';
        boolean a6 = false;
        String a7 = "不可描述";

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个1-7的整数：");
        int day = scan.nextInt();
        //三元运算符
        String status = day >=6 ? "周末": "工作日";
        System.out.println("今天是：" + status);

        for(int a = 1;a < 14;a++) {
            for(int b = 1;b < 10;b++) {
                for(int c = 1;c < 14;c++) {
                    for(int d = 1;d < 10;d++){
                        if(a + b == 8 && c - d == 6 && a + c == 14 && b + d == 10) {
                            System.out.println("满足条件的数为：" + a);
                            System.out.println("满足条件的数为：" + b);
                            System.out.println("满足条件的数为：" + c);
                            System.out.println("满足条件的数为：" + d);
                        }
                    }
                }
            }
        }
    }
}
