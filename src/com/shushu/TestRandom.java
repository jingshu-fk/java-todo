package com.shushu;

import java.util.Random;
import java.util.Scanner;


//生成一个随机数，让用户输入数字来猜
public class TestRandom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int ran1 = r.nextInt(100)+1;

        int num = 0;
        int n = 0;
        while (ran1 != num) {
            System.out.println("请输入你的猜测数字：");
            num = scanner.nextInt();
            if (num > ran1) {
                n += 1;
                System.out.println("数字猜大了兄弟！");
            } else if (num < ran1) {
                System.out.println("数字猜小了兄弟！");
                n += 1;
            } else {
                System.out.println("恭喜你猜对了！");
                n += 1;
            }
        }
        System.out.printf("你一共猜了%d次！", n);
    }
}
