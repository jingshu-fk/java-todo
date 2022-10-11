package com.month202105.testcase;

/*
输出 0-99，两个数值间使用空格分隔，每 10 个数一行，每行用 ---- 分隔
 */

public class TestCase02 {
    public static void main(String[] args) {
        lable:
        for(int i=0;i<=9;i++) {
            for(int j=0;j<=9;j++) {
                if(i > 2) {
                    break lable;
                }
                System.out.print("" + i + j + " ");
            }
            System.out.println("\n------------------------");
        }
    }
}
