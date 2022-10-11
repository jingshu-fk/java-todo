package com.testcase.day20210914;

import java.io.IOException;
import java.util.Scanner;

public class LoginTest {
    public static void main(String[] args) throws IOException {
        EmployeeSystem es = new EmployeeSystem();
        Scanner sc = new Scanner(System.in);
        System.out.println("######################################\n" +
                "            欢迎登录工资管理系统             \n" +
                "#######################################\n" +
                "1、登录系统\n" +
                "2、注册账号\n" +
                "3、删除账号\n" +
                "4、修改密码");
        System.out.println("请选择操作：");
        int select = sc.nextInt();
        if (select == 1) {
            System.out.println("请输入用户名：");
            String loginUser = sc.next();
            System.out.println("请输入密码：");
            String loginPwd = sc.next();
            if (es.login(loginUser, loginPwd)) {
                System.out.println("<<<<<<<<<<<登录成功>>>>>>>>>>>");
                PayrollSystem ps = new PayrollSystem();
                ps.common();
            }else {
                System.out.println("用户名或密码错误，请重新输入！");
            }
        }else if(select == 2) {
            System.out.println("请输入用户名：");
            String username = sc.next();
            if(es.userExist(username)){
                System.out.println("用户名已存在，不能注册！");
            }else {
                System.out.println("请设置你的密码：");
                String password = sc.next();
                System.out.println("请再次输入密码：");
                String confirmPwd = sc.next();
                es.registry(username, password, confirmPwd);
                System.out.println("注册成功！");
            }
        }else if(select == 3) {
            System.out.println("请输入要删除的用户名：");
            String username = sc.next();
            if(es.userExist(username)){
                es.deleteUser(username);
                System.out.printf("用户%s删除成功", username);
            }else {
                System.out.printf("用户%s不存在！", username);
            }
        }else if(select == 4) {
            System.out.println("请输入用户名：");
            String username = sc.next();
            if(es.userExist(username)){
                System.out.println("请输入旧密码：");
                String oldPwd = sc.next();
                System.out.println("请输入新密码：");
                String newPwd = sc.next();
                if (es.updatePwd(username, oldPwd, newPwd)){
                    System.out.println("密码修改成功！");
                }else {
                    System.out.println("旧密码错误！修改密码失败");
                }
            }
        }
    }
}
