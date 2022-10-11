package com.month202108.partOfThread;

/*
@Time:2021-08-10
Thread多线程创建
 */

public class ThreadDemoOne {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("start new thread!");
    }
}
