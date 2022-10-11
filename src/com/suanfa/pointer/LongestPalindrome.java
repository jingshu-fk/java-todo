package com.suanfa.pointer;

/**
 * @author SHUJINGPING
 * @description 给你一个字符串，找出S中的最长回文子串
 *
 */
public class LongestPalindrome {
    public String palindrome(String s, int l, int r) {
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            // 左右指针向两边展开
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }

    public String longestPalindrome(String s) {
        String res = "";
        for(int i = 0; i < s.length(); i++) {
            // 寻找以s[i]为中心的奇数回文串
            String s1 = palindrome(s, i, i);
            // 寻找以s[i]、s[i+1]为中心的偶数回文串
            String s2 = palindrome(s, i, i + 1);
            res = res.length() > s1.length() ? res : s1;
            res = res.length() > s2.length() ? res : s2;
        }
        return res;
    }
}
