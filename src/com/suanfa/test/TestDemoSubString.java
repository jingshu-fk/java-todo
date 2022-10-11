package com.suanfa.test;

import java.util.HashMap;

/**
 * @author SHUJINGPING
 * @description
 * 给定⼀个字符串 s，请你找出其中不含有重复字符的最⻓⼦串的⻓度。
 */
public class TestDemoSubString {
    public static void main(String[] args) {
        String s = "ADOBANCODEBC";
        String t = "BAC";
        System.out.println(getLength(s, t));
    }

    public static String getLength(String s, String t) {
        HashMap<Character, Integer> window = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();

        int left = 0, right = 0;
        int start = 0, len = Integer.MAX_VALUE;
        int valid = 0;
        for(int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        while(right < s.length()) {
            char c = s.charAt(right);
            right++;
            if(need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if(window.get(c).equals(need.get(c))) {
                    valid++;
                }
            }

            while(valid == need.size()) {
                if(right - left < len) {
                    start = left;
                    len = right - left;
                }
                char d = s.charAt(left);
                left++;
                if(need.containsKey(d)) {
                    if(window.get(d).equals(need.get(d))) {
                        valid--;
                    }
                    window.put(d, window.get(d) - 1);
                }
            }
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(start, len + start);
    }
}
