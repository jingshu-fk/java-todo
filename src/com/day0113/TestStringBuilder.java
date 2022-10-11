package com.day0113;


//StringBuilder的使用：高效拼接字符串
public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        s.append("舒景平");
        s.append("审");
        s.insert(2, "KKF");
        System.out.println(s);
        s.delete(3,5);
        System.out.println(s);
    }
}
