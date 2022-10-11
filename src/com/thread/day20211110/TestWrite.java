package com.thread.day20211110;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author SHUJINGPING
 * @Time: 2021-11-10
 * 通过ReadWriteLock读写锁中的写锁,只允许有一个线程执行lock()后面的代码
 */
public class TestWrite {
    static class YourService {
        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

        public void write() {
            try {
                readWriteLock.writeLock().lock(); //获得写锁
                System.out.println(Thread.currentThread().getName() + "获得写锁,开始修改数据的时间--" +System.currentTimeMillis());
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(Thread.currentThread().getName() + "读取数据完毕时的时间==" + System.currentTimeMillis());
                readWriteLock.writeLock().unlock();
            }
        }
    }

    public static void main(String[] args) {
        YourService yourService = new YourService();

        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    yourService.write();
                }
            }).start();
        }
    }
}
