package com.day0114;
/**
 * @author SHUJINGPING
 * @Time: 2021-01-14
 * split分割字符
 */

public class PracSplit {
    public static void main(String[] args) {
        String s = "Hello,Java";
        String[] name = s.split(",");
        System.out.println(name[0]);
    }
}
