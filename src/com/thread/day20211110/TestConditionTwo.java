package com.thread.day20211110;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author SHUJINGPING
 * @Time: 2021-11-10
 * Condition实现生产消费者模式，两个线程交替打印
 */

public class TestConditionTwo {
    static class MyService {
        private Lock lock = new ReentrantLock();
        private Condition condition = lock.newCondition();
        private boolean flag = true;

        public void printOne(){
            try {
                lock.lock();
                while (flag) {
                    System.out.println(Thread.currentThread().getName() + "wait");
                    condition.await();
                }
                System.out.println(Thread.currentThread().getName() + "----");
                flag = true;
                condition.signal();
            } catch (InterruptedException e)  {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }

        public void printTwo() {
            try {
                lock.lock();
                while (!flag) {
                    System.out.println(Thread.currentThread().getName() + "waiting...");
                    condition.await();
                }
                System.out.println(Thread.currentThread().getName() + "****");
                flag = false;
                condition.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        MyService myService = new MyService();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    myService.printOne();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    myService.printTwo();
                }
            }
        }).start();
    }
}
