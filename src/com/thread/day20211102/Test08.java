package com.thread.day20211102;
/**
 * @author SHUJINGPING
 * @Time:  2021-11-02
 * @param: 死锁，避免得获得锁的顺序保持一致；
 */
public class Test08 {
    public static void main(String[] args) {
        SubThread t1 = new SubThread();
        t1.setName("a");
        t1.start();

        SubThread t2 = new SubThread();
        t2.setName("b");
        t2.start();
    }


    static class SubThread extends Thread {
        private static final Object lock1 = new Object();
        private static final Object lock2 = new Object();

        @Override
        public void run() {
            if ("a".equals(Thread.currentThread().getName())) {
                synchronized (lock1) {
                    System.out.println("a线程获得了lock1锁,还需要获得lock2锁");
                    synchronized (lock2) {
                        System.out.println("a线程获得lock1后又获得了lock2,可以想干任何想干的事");
                    }
                }
            }
            if ("b".equals(Thread.currentThread().getName())) {
                synchronized (lock1) {
                    System.out.println("b线程获得了lock2锁,还需要获得lock1锁");
                    synchronized (lock2) {
                        System.out.println("b 线程获得lock2后又获得了lock1,可以想干任何想干的事");
                    }
                }
            }
        }
    }
}
