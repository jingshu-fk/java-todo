package com.suanfa.array;

import java.util.HashMap;

/**
 * @author SHUJINGPING
 * 3 滑动窗口
 *
 */

public class MinWindow {

    public String minWindow(String s, String t) {
        // 需要凑齐的字符和数量
        HashMap<Character, Integer> need = new HashMap<>();
        // 窗口中的字符和数量
        HashMap<Character, Integer> window = new HashMap<>();
        for(int i = 0;i < t.length();i++) {
            char c = t.charAt(i);
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0;
        // 窗口中满足need条件的字符个数
        int valid = 0;
        // 记录最小覆盖子串的起始索引和长度
        int start = 0, len = Integer.MAX_VALUE;
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

            // 判断是否需要收缩窗口
            while(valid == need.size()) {
                // 更新最小覆盖子串
                if(right - left < len) {
                    start = left;
                    len = right - left;
                }
                // d是移出窗口的字符
                char d = s.charAt(left);
                // 左移窗口
                left++;
                if(need.containsKey(d)){
                    if(window.get(d).equals(need.get(d))) {
                        valid--;
                    }
                    // 这里要和right右移是同步的
                    window.put(d, window.get(d) - 1);
                }
            }
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }
}
