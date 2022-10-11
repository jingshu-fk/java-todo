package com.testcase.month202111;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Yes03 {
    public static void main(String[] args) {
        // 1 创建List
        List<String> list = new ArrayList<>();

        // 2 常用方法
        list.add("阿叔");
        list.add("阿珺");
        list.add("阿p");
        System.out.println(list.get(1));
        for (Iterator<String> it = list.iterator(); it.hasNext();) {
            String s = it.next();
            System.out.println(s);
        }

        // 3 list转为array
        String[] array = list.toArray(new String[list.size()]);
        for (String a: array) {
            System.out.println(a);
        }
        System.out.println(list.contains("阿珺"));
        System.out.println(list.indexOf("阿p"));
    }
}
