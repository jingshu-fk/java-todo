package com.day0112;

import java.util.Scanner;

public class TestScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个你的成绩：");
        int score = scanner.nextInt();
        //三元运算符
        String point = score >= 90 ? "A": score > 60 ? "B" : "C";
        System.out.println(point);
    }
}
