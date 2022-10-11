package com.month202105.jihe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
List：
    1、有序列表
    2、可以重复
 */

public class FirstList {
    public static void main(String[] args) {
        List<String> st = new ArrayList<>();
        st.add("apple");
        st.add("banana");
        st.add("阿舒");
        for(String s: st) {
            System.out.println(s);
        }

        // List转化为Array
        String[] ar = st.toArray(new String[0]);
        for(String a: ar) {
            System.out.println(a);
        }

        // Array转为List
        Integer[] it = {1, 2, 3};
        List<Integer> nums = Arrays.asList(it);
        for(Integer num: nums) {
            System.out.println(num);
        }
    }
}
