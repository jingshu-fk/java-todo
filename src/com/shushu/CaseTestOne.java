package com.shushu;

import java.util.Scanner;

public class CaseTestOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字：");
        int num = scanner.nextInt();
        String transNum = String.valueOf(num); //转为字符串
        if (transNum.length() == 4) {  //判断长度是否为4
            System.out.println("登录成功");
        } else {
            System.out.println("你输入的会员号有误");
        }
    }
}
