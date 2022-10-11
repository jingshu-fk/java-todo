package com.day20210315;


import java.io.UnsupportedEncodingException;

import java.util.Scanner;

public class DataString {
    public static void main(String[] args) {
        String greeting = "Hello";
        // 1.提取字符串子串
        String s = greeting.substring(2,5);
        System.out.println(s);


        int age = 13;
        // 2.int类型自动转为了字符串类型
        String rating = "PG" + age;
        System.out.println(rating);
        // 3.构建字符串
        StringBuilder builder = new StringBuilder();
        builder.append("ch");
        builder.append("str");
        String completedString = builder.toString();
        System.out.println(completedString);
		
		// 4.输入输出
		Scanner in = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = in.nextLine();
		System.out.println(name);
		System.out.println("What is your age?");
		int myAge = in.nextInt();
		System.out.println(myAge);
    }
}
