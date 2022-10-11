package com.common;

/**
 * 中断外层for循环
 */
public class BreakOutLoop {
    public static void main(String[] args) {
//        outcrop: //给循环设置个标签
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i * j > 6) {
                    System.out.println("Breaking");
//                    break outcrop;
                    break;
                }
                System.out.println(i + " " + j);
            }
        }
        System.out.println("Done");
    }
}
