package com.testcase;

/**
 * @Time: 2021-08-12
 * 替换1-20内的数字，3的倍数和5的倍数用不同的数字代替。列出1到20的数字，若是3的倍数就用apple代替，
 * 若是5的倍数就用orange代替，若既是3的倍数又是5的倍数就用appleorange代替。
 */

public class CaseReplace {
    public static void main(String[] args) {
        for(int i = 1; i <= 20; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("appleorange");
            } else if (i % 5 == 0) {
                System.out.println("orange");
            } else if (i % 3 == 0) {
                System.out.println("apple");
            } else {
                System.out.println(i);
            }
        }
    }
}
