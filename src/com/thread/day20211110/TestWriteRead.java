package com.thread.day20211110;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author SHUJINGPING
 * @Time: 2021-11-10
 * 写锁是独占锁,是排他锁,读线程与写线程也是互斥的。
 */
public class TestWriteRead {
    static class AndService {
        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        Lock readLock = readWriteLock.readLock(); // 获得读锁
        Lock writeLock = readWriteLock.writeLock(); // 获得写锁

        public void asRead() {
            try {
                readLock.lock();
                System.out.println(Thread.currentThread().getName() + "获得读锁,开始读取数据的时间--" + System.currentTimeMillis());
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                readLock.unlock();
            }
        }

        public void asWrite() {
            try {
                writeLock.lock();
                System.out.println(Thread.currentThread().getName() + "修改数据完毕时的时间==" + System.currentTimeMillis());
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                writeLock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        AndService andService = new AndService();

        new Thread(new Runnable() {
            @Override
            public void run() {
                andService.asRead();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                andService.asWrite();
            }
        }).start();
    }


}
