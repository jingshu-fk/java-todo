package com.thread.day20211102;
/**
 * @author SHUJINGPING
 * @Time: 2021-11-05
 * @deprecated wait会使当前线程释放锁，notify会使当前线程的同步代码块执行结束后释放锁
 */
public class Test10 {
    public static void main(String[] args) throws InterruptedException{
        String lock = "hello";
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println("线程1开始等待:" + System.currentTimeMillis());
                    try {
                        lock.wait();  //当前线程释放锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("线程1结束等待:" + System.currentTimeMillis());
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println("线程2开始唤醒 :" + System.currentTimeMillis());
                    lock.notify(); //等同步代码块执行完毕后释放锁
                    System.out.println("线程2结束唤醒 :" + System.currentTimeMillis());
                }
            }
        });

        t1.start();
        Thread.sleep(6000);
        t2.start();
    }
}
