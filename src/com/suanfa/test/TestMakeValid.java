package com.suanfa.test;

/**
 * @author SHUJINGPING
 * @description
 * 给你输⼊⼀个字符串 s，你可以在其中的任意位置插⼊左括号 ( 或者右括号 )，请问你最少需要⼏次插⼊才
 * 能使得 s 变成⼀个合法的括号串？
 */
public class TestMakeValid {
    public int minAddToMakeValid(String s) {
        // 记录插入次数
        int res = 0;
        // 记录右括号需求个数
        int need = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.indexOf(i) == '(') {
                need++;
            }
            if(s.indexOf(i) == ')') {
                need--;

                if(need == -1) {
                    need = 0;
                    // 需要插入一个左括号
                    res++;
                }
            }
        }
        return res + need;
    }
}


