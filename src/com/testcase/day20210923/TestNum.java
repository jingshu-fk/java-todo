package com.testcase.day20210923;
/*
输出如下内容
1 10 100 1000
2 20 200 2000
3 30 300 3000
4 40 400 4000
5 50 500 5000
 */
public class TestNum {
    public static void main(String[] args) {
        for(int i=1;i < 6;i++){
            int temp = i;
            for(int j=1;j < 4;j++){
                System.out.print(temp + " ");
                temp *= 10;
            }
            System.out.println(temp + " ");
        }
    }
}
