package com.day0112;

import java.util.Scanner;

public class TestCunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要反弹的次数：");
        int a1 = scanner.nextInt();
        sumLength(a1);
    }


    //接收参数反弹次数，初始高度100，每次反弹后为原高度一半，计算n次反弹后的路线总长度和下次反弹的高度
    public static void sumLength(int a1) {
        double height = 100;
        double sumLength = 0;

        for (int i = 1; i <= a1; i++) {
            if (i == 1) {
                sumLength = sumLength + height;
            } else {
                sumLength = sumLength + height * 2;
            }
            height = height / 2;
        }
        System.out.printf("%d次反弹落地经过的总长度为：%.2f\n", a1, sumLength);
        System.out.printf("%d次反弹的高度为：%.2f", (a1+1), height);
    }

}
