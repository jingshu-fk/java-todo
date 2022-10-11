package com.month202105.jihe;

import java.util.HashSet;
import java.util.Set;

/*
Set是接口:
HashSet的底层其实就是HashMap，向HashSet中添加元素，就是把这个元素作为键添加到HashMap中
 */
public class SetCase {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("abc");
        set.add("xyz");
        set.add("null");
        System.out.println(set);
        System.out.println(set.size());
    }
}
