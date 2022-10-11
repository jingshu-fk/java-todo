package com.shushu;
import java.util.Scanner;


//输入三个数字，从小到大排序
public class TestCaseTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int a = scanner.nextInt();
        System.out.println("请输入第二个数字：");
        int b = scanner.nextInt();
        System.out.println("请输入第三个数字：");
        int c = scanner.nextInt();
        int x = 0;
        if (a > b) {
            x = a;
            a = b;
            b = x;
        }
        if (a > c) {
            x = a;
            a = c;
            c = x;
        }
        if (b > c) {
            x = b;
            b = c;
            c = x;
        }
        System.out.println(a +"," + b + "," + c);
    }
}
