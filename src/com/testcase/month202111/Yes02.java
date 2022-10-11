package com.testcase.month202111;

/**
 * @author SHUJINGPING
 * @Time: 2021-11-16
 * 一个整数，加上100是平方数，再加上168也是平方数，求这个数？
 */
public class Yes02 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        while (true) {
            int temp = x * x;
            while (y * y - temp < 168) {
                y++;
            }
            if ( y * y - x * x == 168 && (y * y - 168 - 100) >= 0) {
                System.out.println("这个整数是：" + (y * y - 100 - 168));
                break;
            } else {
                x++;
            }
        }
    }
}
