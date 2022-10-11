package com.testcase.day20210914;

import java.util.Scanner;

public class TestSplit {
    public static void main(String[] args) {
        String a = "zhangfei 15000";
        String a1 = a.split(" ")[0];
        String a2 = a.split(" ")[1];
        double a3 = Double.parseDouble(a2);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入员工信息：");
        String upUser = sc.nextLine();
        System.out.println(upUser);
        System.out.println(Double.parseDouble(upUser.split(" ")[1]));

    }
}
