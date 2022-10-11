package com.thread.day20211109;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author SHUJINGPING
 * @Time: 2021-11-09
 * lockInterruptibly如果当前线程被中断，不会获得锁，会抛出异常
 */
public class TestLockThree {
    static class Servier {
        private Lock lock = new ReentrantLock();

        public void serviceMethod() {
            try {
                // 如果线程被中断了，不会获得锁，会抛出异常
                lock.lockInterruptibly();
                System.out.println(Thread.currentThread().getName() + "begin lock");
                for (int i = 0; i < Integer.MAX_VALUE; i++) {
                    new StringBuilder();
                }
                System.out.println(Thread.currentThread().getName() + "end lock");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(Thread.currentThread().getName() + "**** 释放锁");
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Servier s = new Servier();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                s.serviceMethod();
            }
        };

        Thread t1 = new Thread(r);
        t1.start();

        Thread.sleep(50);
        Thread t2 = new Thread(r);
        t2.start();
        Thread.sleep(50);
        t2.interrupt();
    }
}
