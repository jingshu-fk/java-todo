package com.suanfa.test;

import com.suanfa.array.MinWindow;

import java.util.HashMap;

/**
 * @author SHUJINGPING
 * 1、给你一个字符串 s 、一个字符串 t 。返回 s 中涵盖 t 所有字符的最小子串。如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。
 * 2、给定两个字符串s1和s2，写一个函数判断s2的子串包含s1的排列，返回true或false
 *      相当给你⼀个 S 和⼀个 T，请问你 S 中是否存在⼀个⼦串，包含 T 中所有字符且不包含其他字符？
 */
public class TestMinWindow {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaoo";
        System.out.println(caseWindow(s2, s1));
//        String s = "ADOBECODEBANC";
//        String t = "ABC";
//        MinWindow minWindow = new MinWindow();
//        System.out.println(minWindow.minWindow(s, t));
    }

    public static boolean caseWindow(String s, String t) {
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        for(int i = 0;i < t.length();i++) {
            char c = t.charAt(i);
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0;
        // 窗口中满足need条件的字符个数
        int valid = 0;
        while(right < s.length()) {
            // c是移入窗口的字符
            char c = s.charAt(right);
            // 右移窗口
            right++;
            // 进行窗口内的数据更新
            if(need.containsKey(c)){
                // 这是在need要求的字符才放进window
                window.put(c, window.getOrDefault(c, 0) + 1);
                if(window.get(c).equals(need.get(c))){
                    valid++;
                }
            }

            //判断是否需要收缩窗口
            while(right - left >= t.length()) {
                // 如果相等，说明s的子串有满足包含t的排列
                if(valid == need.size()) {
                    return true;
                }
                // d是移出窗口的字符
                char d = s.charAt(left);
                // 左移窗口
                left++;
                if(need.containsKey(d)){
                    if(window.get(d).equals(need.get(d))) {
                        valid--;
                    }
                    window.put(d, window.get(d) - 1);
                }
            }
        }
        return false;
    }
}
