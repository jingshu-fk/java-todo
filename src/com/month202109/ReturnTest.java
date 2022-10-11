package com.month202109;

// break和return
public class ReturnTest {
    public static void main(String[] args) {
        for(int i = 1;i < 10;i++) {
            if(i == 5){
                return; //这里换成break呢？
            }
            System.out.println("i =" + i);
        }
        System.out.println("继续执行");
    }
}

