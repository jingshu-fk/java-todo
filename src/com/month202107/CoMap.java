package com.month202107;

import java.util.HashMap;
import java.util.Map;

public class CoMap {
    public static void main(String[] args){
        Map<String, Integer> grade = new HashMap<>();
        grade.put("舒景平", 26);
        grade.put("null", 0);
        grade.put("ace", null);
        System.out.println(grade);
        System.out.println(grade.get("ac"));

        int nums [] = {1, 3, 5};
        for(int m : nums) {
            System.out.println(m);
        }
    }
}
