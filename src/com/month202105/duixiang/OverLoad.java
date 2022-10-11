package com.month202105.duixiang;

public class OverLoad {
    public static void main(String[] args) {
        String s1 = "Test String";
        String s2 = "Test strIng";
        System.out.println(s1.compareTo(s2));

        System.out.println(s1.lastIndexOf("String"));
    }
}
