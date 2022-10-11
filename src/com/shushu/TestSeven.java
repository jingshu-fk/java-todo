package com.shushu;


//1-100之间所有不是7的倍数和不包含7的数字，并求和
public class TestSeven {
    public static void main(String[] args) {
        int sumCnt = 0;
        for (int i=1;i<=100;i++) {
            if ((i % 7 == 0) && (i % 10 == 7) && (i / 10 == 7)) {
                System.out.println(i);
                continue; //提前结束本次循环，继续下次循环
            }
            sumCnt += i;
        }
        System.out.println(sumCnt);
    }
}
