package com.thread.day20211111;

/**
 * @author SHUJINGPING
 * @Time: 2021-11-11
 * 线程组的interrupt() 可以给该线程组中所有的活动线程添加中断标志
 */

public class TestInterrupt {
    public static void main(String[] args) throws InterruptedException{
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("当前线程--" + Thread.currentThread() + "--开始循环");
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println(Thread.currentThread().getName() + "----");
                }
                System.out.println(Thread.currentThread().getName() + "循环结束");
            }
        };

        ThreadGroup group = new ThreadGroup("group");

        for (int i = 0; i < 5; i++) {
            new Thread(group, r).start();
        }

        Thread.sleep(50);
        group.interrupt();
    }
}
