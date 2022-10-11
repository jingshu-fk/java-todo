package com.thread.day20211109;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author SHUJINGPING
 * @Time: 2021-11-09
 * tryLock(long time, TimeUnit unit)：当锁没有被其他线程锁持有的情况下，可以获得锁
 */
public class TestTryLock {
    static class TimeLock implements Runnable {
        private static ReentrantLock lock = new ReentrantLock();

        @Override
        public void run() {
            try {
                if (lock.tryLock(3, TimeUnit.SECONDS)) {
                    System.out.println(Thread.currentThread().getName() + "获得锁，执行耗时任务");
                    Thread.sleep(4000);
                }else {
                    System.out.println(Thread.currentThread().getName() + "没有获得锁");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                // 如果被当前线程获得了锁，最后去释放掉
                if (lock.isHeldByCurrentThread()) {
                    lock.unlock();
                }
            }
        }
    }

    public static void main(String[] args) {
        TimeLock tl = new TimeLock();

        Thread t1 = new Thread(tl);
        Thread t2 = new Thread(tl);
        t1.start();
        t2.start();
    }
}
