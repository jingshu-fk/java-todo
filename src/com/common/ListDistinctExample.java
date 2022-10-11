package com.common;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author SHUJINGPING
 * @date 2022-6-9
 * @description list去重
 */
public class ListDistinctExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(7);
        list.add(2);
        list.add(4);
        list.add(9);
        list.add(2);
        System.out.println(list.toString());
//        method(list);
        core(list);
    }


    public static void method(List<Integer> list) {
        // linkedHashSet既能去重又不重新排序
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>(list);
        System.out.println("去重集合：" + set);
    }

    public static void core(List<Integer> list) {
        list = list.stream().distinct().collect(Collectors.toList());
        System.out.println("去重集合：" + list);
    }
}
