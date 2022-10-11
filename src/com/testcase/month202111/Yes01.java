package com.testcase.month202111;

import java.util.Scanner;

/**
 * @author SHUJINGPING
 * @Time: 2021-11-16
 * 接收参数反弹次数，初始高度100，每次反弹后为原高度一半，计算n次反弹后的路线总长度和下次反弹的高度
 */
public class Yes01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要反弹的次数：");
        int num = scanner.nextInt();
        getMouse(num);
    }

    static void getMouse(int n) {
        double height = 100;
        double sumLength = 0;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                sumLength = sumLength + height;
            } else {
                sumLength = sumLength + height * 2;
            }
            height = height / 2;
        }

        System.out.printf("%d次反弹后的总长度为：%.2f\n", n, sumLength);
        System.out.printf("下次反弹的高度为：%.2f", height);
    }
}
