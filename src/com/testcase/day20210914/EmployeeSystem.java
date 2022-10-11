package com.testcase.day20210914;
/*
1、系统的属性：

2、员工系统的行为：
    注册账号
    登录
    校验用户密码
    校验用户是否存在

    修改密码
    删除用户
    获取所有用户信息
    保存用户信息
    退出
 */

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeSystem {
    HashMap<String, String> userInfo;
    final String file = "D:\\JavaWorkSpace\\StartOne\\src\\com\\testcase\\day20210914\\info.txt";

    public EmployeeSystem() {
        userInfo = new HashMap<>();
    }

    public void registry(String user, String password, String confirmPwd) throws IOException {
        while (!confirmPwd.equals(password)) {
            System.out.println("两次输入密码不一致，请重新输入");
            Scanner s = new Scanner(System.in);
            System.out.println("请设置你的密码：");
            password = s.next();
            System.out.println("请再次输入你的密码：");
            confirmPwd = s.next();
        }
        String userMsg = user + ":" + password;
        write_info(file, userMsg);
    }

    public boolean login(String user, String password) throws IOException {
        if(isUser(user, password)) {
            return true;
        }else {
            return false;
        }
    }

    // 写入用户信息到文件info.txt
    public void write_info(String file, String content) throws IOException {
        try(Writer writer = new FileWriter(file, true)) {
            writer.write(content + '\n');
        }
    }

    public boolean isUser(String user, String password) throws IOException {
        if (!userExist(user)) {
            return false;
        }else {
            return getUserInfo().get(user).equals(password);
        }
        // 校验用户密码是否正确
    }

    //获取用户信息
    public HashMap<String, String> getUserInfo() throws IOException {
        try(InputStreamReader reader = new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8)){
            BufferedReader bufferedReader = new BufferedReader(reader);
            String lineTxt = null;
            while ((lineTxt = bufferedReader.readLine()) != null){
                System.out.println("lineTxt=" + lineTxt);
                String reds = lineTxt.split(":")[0];
                String pwd = lineTxt.split(":")[1];
                userInfo.put(reds, pwd);
            }
        }
        return userInfo;
    }

    //判断用户名是否存在
    public boolean userExist(String user) throws IOException {
        if (userInfo.containsKey(user)){ //先去缓存中去找
            return true;
        }else {
            return getUserInfo().containsKey(user);
        }
    }

    // 修改密码
    public boolean updatePwd(String user, String oldPwd, String newPwd) throws IOException {
        getUserInfo();
        if(userInfo.get(user).equals(oldPwd)){
            userInfo.put(user, newPwd);
            System.out.println(userInfo);
            try(Writer writer = new FileWriter(file)){
                for(Map.Entry<String, String> entry: userInfo.entrySet()) {
                    String msg = entry.getKey() + ":" + entry.getValue() + "\n";
                    writer.write(msg);
                }
            }
            return true;
        }else {
            return false;
        }
    }
    // 删除用户
    public void deleteUser(String user) throws IOException {
        getUserInfo();
        userInfo.remove(user);
        try(Writer writer = new FileWriter(file)){
            for(Map.Entry<String, String> entry: userInfo.entrySet()) {
                String msg = entry.getKey() + ":" + entry.getValue() + "\n";
                writer.write(msg);
            }
        }
    }
}

