package com.suanfa.test;

/**
 * @author SHUJINGPING
 * @description
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 s 的形式给出。
 *
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组
 */
public class TestReverse {
    public static void main(String[] args) {
        char[] c = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(reverseString(c));
    }

    public static char[] reverseString(char[] c) {
        int left = 0;
        int right = c.length - 1;
        while(left < right) {
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;
            left++;
            right--;
        }
        return c;
    }
}
