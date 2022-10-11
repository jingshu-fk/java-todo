package com.day0119;

import java.util.HashSet;
import java.util.TreeSet;

public class PracSet {
    public static void main(String[] args) {
        // 创建set,HashSet是无序的
//        HashSet<String> set = new HashSet<>();

        // TreeSet是有序的
        TreeSet<String> set = new TreeSet<>();
        set.add("apple");
        set.add("banana");
        set.add("click");
        set.add("get");
        System.out.println(set);
        System.out.println(set.contains("a"));


        for (String s: set) {
            System.out.println(s);
        }
    }
}
