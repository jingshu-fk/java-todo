package com.suanfa.pointer;

/**
 * @author SHUJINGPING
 * @description 判断一个字符串是不是回文串，即正着读和反着读都一样
 *
 * 解法：使用左右指针
 */
public class IsPalindrome {

    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
