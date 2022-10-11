package com.month202107.partOfIo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
输入用户名、密码；
保存输出到文件user.txt
 */
public class CharStreamDemo8 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        System.out.println("请输入密码：");
        String pwd = sc.next();
        String tePath = "D:\\JavaWorkSpace\\StartOne\\src\\com\\month202107\\partOfIo";
        try(FileWriter fw = new FileWriter(tePath + "\\user.txt")) {
            fw.write(username);
            fw.write("\r\n");
            fw.write(pwd);
        }
    }
}
