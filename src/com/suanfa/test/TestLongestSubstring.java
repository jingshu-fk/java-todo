package com.suanfa.test;

import java.util.HashMap;

import static java.lang.Math.max;

/**
 * @author SHUJINGPING
 * @description  给定一个字符串S，找出其中最长不包含重复字符的子串，返回长度
 */
public class TestLongestSubstring {
    public static void main(String[] args) {
        String s = "skteuwsth";
        System.out.println(findLongestSubstring(s));
    }


    public static Integer findLongestSubstring(String s){
        HashMap<Character, Integer> window = new HashMap<Character, Integer>();
        int left = 0, right = 0;
        int res = 0;
        while(right < s.length()){
            char c = s.charAt(right);
            right++;
//            window.put(c, window.getOrDefault(c, 0) + 1);
//            while(window.get(c) > 1) {
//                char d = s.charAt(left);
//                left++;
//                window.put(d, window.get(d) - 1);
//            }
            if(!window.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
            }else {
                break;
            }
            // 每次收缩完成后更新res，这肯定是没有重复的子串
            res = max(res, right - left);
        }
        return res;
    }
}
