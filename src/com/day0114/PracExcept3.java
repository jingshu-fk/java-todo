package com.day0114;


// 抛出异常
public class PracExcept3 {
    public static void main(String[] args) {
        try {
            process1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void process1() {
        try {
            process2();
        } catch (NullPointerException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void process2() {
        throw new NullPointerException();
    }
}
