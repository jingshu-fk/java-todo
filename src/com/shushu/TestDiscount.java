package com.shushu;

import java.util.Scanner;


//根据积分打折扣
public class TestDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的消费金额：");
        double consume = scanner.nextInt();
        System.out.println("请输入你的积分：");
        int ger = scanner.nextInt();
        if (ger <= 1000) {
            consume = consume * 0.9;
        } else if (ger <= 4000) {
            consume = consume * 0.8;
        } else if (ger <= 8000) {
            consume = consume * 0.75;
        } else {
            consume = consume * 0.7;
        }
        System.out.printf("您需支付金额：%.2f", consume);
    }
}
