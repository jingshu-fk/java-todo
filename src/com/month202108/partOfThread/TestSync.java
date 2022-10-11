package com.month202108.partOfThread;

/**
 * @Time: 2021-08-13
 * synchronized实现内部锁，必须锁定同一个对象
 */
public class TestSync {
    public static void main(String[] args) throws InterruptedException {
        AddThread add = new AddThread();
        DecThread dec = new DecThread();
        add.start();
        dec.start();
        add.join();
        dec.join();
        System.out.println(Counter.count);
    }
}


class Counter{
    public static final Object lock = new Object();
    public static int count = 0;
}


class AddThread extends Thread {
    @Override
    public void run() {
        for (int i=0; i<10000; i++) {
            synchronized (Counter.lock) {
                Counter.count += 1;
            }
        }
    }
}


class DecThread extends Thread {
    @Override
    public void run() {
        for (int i=0; i<10000; i++) {
            synchronized (Counter.lock) {
                Counter.count -= 1;
            }
        }
    }
}
