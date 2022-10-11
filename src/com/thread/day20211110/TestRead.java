package com.thread.day20211110;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author SHUJINGPING
 * @Time: 2021-11-10
 * ReadWriteLock读写锁可以实现多个线程同时读取共享数据,即读读共享,可以提高程序的读取数据的效率
 */
public class TestRead {
    static class Service {
        // 定义读写锁
        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
//        private Lock lock = new ReentrantLock();

        public void read() {
            try {
//                lock.lock();
                readWriteLock.readLock().lock(); // 获得读锁
                System.out.println(Thread.currentThread().getName() + "获得读锁,开始读取数据的时间--" + System.currentTimeMillis());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                readWriteLock.readLock().unlock(); // 释放读锁
//                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        Service service = new Service();

        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    service.read();
                }
            }).start();
        }
    }
}
