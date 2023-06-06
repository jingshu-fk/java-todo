package com.xintest.javaguide;

/**
 * Interview1
 * @description 面试1
 * @author shujingping
 * @date 2022/10/13 4:17 下午
 * @version 1.0
 */
public class Interview1 {
    public static void main(String[] args) {
        boolean flag = false;
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.println("0");
            } else if (i == 1) {
                System.out.println("1");
                continue;
            } else if (i == 2) {
                System.out.println("2");
                flag = true;
            } else if (i == 3) {
                System.out.println("3");
                break;
            } else if (i == 4) {
                System.out.println("4");
            }
            System.out.println("xixi");
        }

        if (flag) {
            System.out.println("haha");
            return;
        }
        System.out.println("heihei");
    }
}
 
