package com.day0114;

public class PracExcept2 {
    public static void main(String[] args) {
        try {
            process1();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static void process1() {
        process2();
    }

    public static void process2() {
        Integer.parseInt(null);
    }
}
