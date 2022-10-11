package com.suanfa.test;

/**
 * @author SHUJINGPING
 * @description 给定字符串s和t，判断s是否为t的⼦序列
 */
public class TestIsSubSequence {

    public static void main(String[] args) {
        String s = "abc";
        String t = "cacbhbc";
        System.out.println(isSubSequence(s, t));
    }

    public static boolean isSubSequence(String s, String t) {
        int i = 0, j = 0;
        while(i < s.length() && j < t.length()) {
            if(s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
