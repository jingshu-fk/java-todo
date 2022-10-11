package com.month202105.basepre;

public class DataType {
    public static void main(String[] args) {
        System.out.println("int的最大值" + Integer.MAX_VALUE);
        int[] numbers = {10, 20, 30, 40, 50};
        for(int num: numbers){
//            if (num == 30) {
//                break; //跳出当前循环，继续执行下面的循环
//            }
            if(num == 30) {
                continue; //立即进行下一次循环
            }
            System.out.println("value of num:" + num);
        }
    }
}
