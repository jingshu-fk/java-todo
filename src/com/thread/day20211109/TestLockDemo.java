package com.thread.day20211109;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

/**
 * @author SHUJINGPING
 * @Time: 2021-11-09
 * LocK锁的基本使用
 */

public class TestLockDemo {
    // 定义锁
    static Lock lock = new ReentrantLock();

    public static void sm() {
        // 获得锁
        lock.lock();

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "--" + i);
        }
        // 释放锁
        lock.unlock();
    }

    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                sm();
            }
        };

        new Thread(r).start();
        new Thread(r).start();
        new Thread(r).start();
    }
}
