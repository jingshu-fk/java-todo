package com.suanfa.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author SHUJINGPING
 * 给定两个字符串 s 和 p，找到 s 中所有 p 的 异位词 的子串，返回这些子串的起始索引。不考虑答案输出的顺序。
 * 异位词 指由相同字母重排列形成的字符串（包括相同的字符串）。
 *    【相当于，输⼊⼀个串 S，⼀个串 T，找到 S 中所有 T 的排列，返回它们的起始索引】
 */
public class TestSortWindow {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String t = "abc";
        System.out.println(findAnagrams(s, t));
    }

    public static List<Integer> findAnagrams(String s, String t) {
        List<Integer> result = new ArrayList<Integer>();
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        for(int i = 0; i < t.length(); i++) {
            char c = s.charAt(i);
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0;
        int valid = 0;
        int start = 0, len = Integer.MAX_VALUE;
        while (right < s.length()) {
            char c = s.charAt(right);
            right++;
            if(need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if(window.get(c).equals(need.get(c))) {
                    valid++;
                }
            }

            while(right - left >= t.length()) {
                if(valid == need.size()) {
                    result.add(left);
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
        return result;
    }
}
