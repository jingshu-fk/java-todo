package com.day0118;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


//使用List有序列表
public class PracList {
    public static void main(String[] args) {
        //创建List，一般指定类型
        List<String> list = new ArrayList<>();
        list.add("阿舒");
        list.add("阿叔");
        list.add(null);
        System.out.println(list.get(2));
        //#1 Iterator遍历List
        for (Iterator<String> it = list.iterator(); it.hasNext();) {
            String s = it.next();
            System.out.println(s);
        }

        //#2 也可以for...each使用
//        for (String s: list) {
//            System.out.println(s);
//        }

        //#3 List转为Array：toArray(T[]);一般传入的大小一致
        String[] array = list.toArray(new String[list.size()]);
        for (String ar: array) {
            System.out.println(ar);
        }

        System.out.println(list.contains("阿舒"));
        System.out.println(list.indexOf(null));

        System.out.println(list.contains("阿舒"));

        LinkedList<String> ll = new LinkedList<String>();
    }
}
