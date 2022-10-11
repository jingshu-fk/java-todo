package com.shushu;

import java.util.Scanner;

public class TestTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的机票原价：");
        double charge = scanner.nextDouble();
        System.out.println("请输入你机票的月份：");
        int month = scanner.nextInt();
        System.out.println("请输入你的舱位类型：1-头等舱，2-经济舱");
        int select = scanner.nextInt();

        if (month >= 5 && month <= 10) {
            if (select == 1) {
                charge = charge * 0.9;
            } else if (select == 2) {
                charge = charge * 0.85;
            }
        } else {
            if (select == 1) {
                charge = charge * 0.7;
            } else if (select == 2) {
                charge = charge * 0.65;
            }
        }
        System.out.println(charge);
    }
}
