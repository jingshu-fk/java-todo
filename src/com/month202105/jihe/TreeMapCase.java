package com.month202105.jihe;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapCase {
    public static void main(String[] args) {
        // TreeMap排序的map
        Map<String, Integer> testMap = new TreeMap<>();
        testMap.put("kiss", 31);
        testMap.put("pass", 21);
        testMap.put("kass", 1);
        testMap.put("guess", 12);

        for(String pot: testMap.keySet()) {
            System.out.println(pot);
        }
    }
}
