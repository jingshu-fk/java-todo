package com.day0113;

/**
 * @author SHUJINGPING
 * @Time: 2021-11-17
 * 常见数据类型互相转换
 */
public class TestType {
    public static void main(String[] args) {
        String a = "Abc";
        String b = a.toUpperCase();
        System.out.println(a == b);
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.contains("b"));
        //数字转为字符串
        int c = 21;
        String c1 = String.valueOf(c);
        System.out.println(c1);
        //字符串转为数字
        String s1 = "123";
        int n1 = Integer.parseInt(s1);
        System.out.println(n1);

        //字符串转为char
        char[] ns = "Hello".toCharArray();
        //char转为字符串
        String s2 = new String(ns);
        System.out.println(s2);
        ns[1] = 'X';
        System.out.println(s2);
    }
}
