package com.month202105.testcase;

/*
一只小猴子一天摘了许多桃子，第一天吃了一半，然后忍不住又吃了一个；第二天又吃了一半，再加上一个；
后面每天都是这样吃。到第10天的时候，小猴子发现只有一个桃子了。问小猴子第一天共摘了多少个桃子。
sum1 = sum2 / 2 + 1 + 1
 */
public class TestCase03 {
    public static void main(String[] args){
        int sum = 1;
        for(int i=9;i>=1;i--) {
            sum = (sum + 1) * 2;
        }
        System.out.println("sum=" +sum);
    }
}
