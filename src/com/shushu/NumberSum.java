package com.shushu;
import java.util.Scanner;

/**
判断年份是不是闰年
 */
public class NumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要测试的年份：");
        int testYear = scanner.nextInt();
        if ((testYear % 4 == 0 && testYear % 100 != 0) || (testYear % 400 == 0)) {
            System.out.printf("%d是闰年", testYear);
        } else {
            System.out.printf("%d不是闰年", testYear);
        }
    }
}


