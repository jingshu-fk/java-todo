package com.testcase;

/*
引用数据类型传递，会改变引用类型的数据
 */
public class Num2 {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 4, 5};
        change(num1);
        System.out.println(num1[0]);
    }

    public static void change(int[] array) {
        array[0] = 3;
    }
}


