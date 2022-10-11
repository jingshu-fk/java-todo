package com.month202105.testcase;

import java.util.Scanner;

//静态方法使用
public class TestCase05 {
    public static void main(String[] args) {
        initUI();
    }

    public static void login(String username, String password) {
        if("admin".equals(username) && "123456".equals(password)) {
            System.out.println("登录成功，欢迎" + username + "回来！");
        }else {
            System.out.println("用户名或者密码不对，请重新输入");
        }
    }

    public static void initUI() {
        System.out.println("欢迎使用本系统，请登录");
        System.out.println("用户名：");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        System.out.println("密码：");
        String password = sc.nextLine();
        login(username, password);
    }
}


