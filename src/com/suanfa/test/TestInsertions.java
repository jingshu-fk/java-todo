package com.suanfa.test;

/**
 * @author SHUJINGPING
 * @description
 * 现在假设 1 个左括号需要匹配 2 个右括号才叫做合法的括号组合，那么给你输⼊⼀个括号串 s，请问你如何
 * 计算使得 s 合法的最⼩插⼊次数呢？
 */
public class TestInsertions {
    public int minInsertions(String s) {
        int res = 0, need = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.indexOf(i) == '(') {
                need += 2;
                if(need % 2 == 1) {
                    res++;
                    need--;
                }
            }

            if(s.indexOf(i) == ')') {
                need--;
                if(need == -1) {
                    res++;
                    need = 1;
                }
            }
        }
        return res + need;
    }
}
