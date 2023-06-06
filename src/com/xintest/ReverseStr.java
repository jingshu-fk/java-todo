package com.xintest;

import java.util.HashSet;
import java.util.Scanner;

/**
 * ReverseStr
 * @description 去重并从右到左读 9876673  37689
 * @author shujingping
 * @date 2022/12/13 7:53 下午
 * @version 1.0
 */
public class ReverseStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入字符串：");
        String s1 = sc.next();

        StringBuilder sb = new StringBuilder();
        HashSet<Character> hs = new HashSet<>();
        for (int i = s1.length() - 1; i >= 0; i--) {
            char c = s1.charAt(i);
            if (!hs.contains(c)) {
                hs.add(c);
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
 
