package com.thread.day20211102;
public class Test {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();

        for (int i = 1; i<=1000; i++) {
            System.out.println("main==>" + i);
        }

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i<=1000; i++) {
                    System.out.println("subThread==>" + i);
                }
            }
        });
        thread1.start();
    }
}
