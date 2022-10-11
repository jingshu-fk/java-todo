package com.month202108.partOfThread;

/*
@Time:2021-08-10
 */
public class MainRun {
    public static void main(String[] args) {
        System.out.println("main start");
        Thread t1 = new Thread(() -> {
            System.out.println("thread start");
            System.out.println("thread end.");
        });
        t1.start();
        System.out.println("main end.");
    }
}
