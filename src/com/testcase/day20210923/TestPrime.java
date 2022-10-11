package com.testcase.day20210923;
/*
@Time：2021-9-23
题目：输出2-10000之间的素数，一行输出8个
 */
public class TestPrime {
    public static void main(String[] args) {
        int num = 0;
        for(int i=2;i < 10000;i++){
            boolean isPrime = true;
            for(int j=2;j < i;j++){
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.print(i + " ");
                num++;
                if(num == 8) {
                    System.out.println();
                    num = 0;
                }
//                if(num < 8){
//                    System.out.print(i + " ");
//                    num++;
//                }else {
//                    System.out.println();
//                    num = 0;
//                }
            }
        }
    }
}
