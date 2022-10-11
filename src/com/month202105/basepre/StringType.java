package com.month202105.basepre;


public class StringType {
    public static void main(String[] args) {
        //获取字符串长度
        String site = "www.baidu.com";
        System.out.println("site的长度为：" + site.length());

        //StringBuilder
        StringBuilder sb = new StringBuilder(10);
        sb.append("Runnel..");
        System.out.println(sb);
        sb.append("!");
        System.out.println(sb);
        sb.insert(8, "Java");
        System.out.println(sb);
        sb.delete(5, 8);
        System.out.println(sb);
    }
}
