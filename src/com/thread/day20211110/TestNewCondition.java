package com.thread.day20211110;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author SHUJINGPING
 * @Time: 2021-11-10
 * await()会使当前线程等待,同时会释放锁,当其他线程调用signal()时,线程会重新获得锁并继续执行
 */
public class TestNewCondition {
    // 定义锁
    static Lock lock = new ReentrantLock();
    // 定义Condition对象
    static Condition condition = lock.newCondition();

    static class SubThread extends Thread {
        @Override
        public void run() {
            try {
                lock.lock();
                System.out.println("method lock");
                condition.await();
                System.out.println("method wait");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
                System.out.println("method unlock");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException{
        SubThread t = new SubThread();
        t.start();

        Thread.sleep(3000);
        try {
            lock.lock();
            condition.signal(); //会唤醒等待的线程： t
        } finally {
            lock.unlock();
        }
    }
}
