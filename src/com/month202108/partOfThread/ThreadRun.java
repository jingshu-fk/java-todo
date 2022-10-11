package com.month202108.partOfThread;

/*
@Time:2021-08-10
Runnable多线程创建
 */

public class ThreadRun {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}


class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("start new thread!");
    }
}
