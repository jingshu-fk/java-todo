package com.testcase.day20210923;
/*
@Time: 2021-9-27
5米高下落，每次弹起高度为原来的30%，经过几次弹起，高度小于0.1
 */
public class TestJump {
    public static void main(String[] args) {
        double height = 5.0;
        int count = 0;
        while(height > 0.1){
            height = height * 0.3;
            count ++;
        }
        System.out.printf("经过%d次高度小于0.1米", count);
    }
}
