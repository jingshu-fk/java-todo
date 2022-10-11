package com.month202109.miniio;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharStreamDemo8 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String userName = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();

        try(FileWriter ft = new FileWriter("D:\\JavaWorkSpace\\StartOne\\src\\com\\month202109\\miniio\\a.txt")) {
            ft.write(userName + ":" + password);
        }
    }
}
