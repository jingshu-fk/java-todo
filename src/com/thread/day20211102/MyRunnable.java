package com.thread.day20211102;
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i<=1000; i++) {
            System.out.println("sub-->" + i);
        }
    }
}
