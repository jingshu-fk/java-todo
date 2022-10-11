package com.day0112;

import java.util.Scanner;


//求两个数的最大公约数和最小公倍数
public class TestGong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int a = scanner.nextInt();
        System.out.println("请输入第二个数字：");
        int b = scanner.nextInt();
//        int temp = a > b ? a: b;
        int temp = Math.max(a, b);
        //遍历比较小的数
        for (int i=temp;i>2;i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.printf("%d和%d的最大公约数为：%d\n", a, b, i);
                System.out.printf("%d和%d的最大公倍数为：%d", a, b, ((a / i) * i * (b/i)));
                break;
            }
        }
    }
}
