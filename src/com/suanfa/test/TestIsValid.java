package com.suanfa.test;

import java.util.Stack;

/**
 * @author SHUJINGPING
 * @description
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 *
 * 有效：{()[()]}
 */


public class TestIsValid {
    public static void main(String[] args) {
        String s = "{()[()}]";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String str) {
        // 使用栈
        Stack<Character> left = new Stack<Character>();
        for(char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                left.push(c);
            } else { // 字符c是右括号
                if (!left.isEmpty()) {
                    if (leftOf(c) != left.pop()) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return left.empty();
    }

    public static char leftOf(char c) {
        if(c == '}') {
            return '{';
        }
        if(c == ')') {
            return '(';
        }
        return '[';
    }
}
