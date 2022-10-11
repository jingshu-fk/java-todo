package com.testcase;


public class IntegerTest{
    public static void main(String[] args) {
        int i = 8;
        do {
            System.out.println(--i);
            --i;
        } while (i != 0);
        System.out.println(i);
    }
}
