package com.thread.day20211111;

/**
 * @author SHUJINGPING
 * @Time: 2021-11-11
 * 调用线程组的setDaemon(true)可以把线程组设置为守护线程组,
 * 当守护线程组中没有任何活动线程时,守护线程组会自动销毁
 */
public class TestDaemon {
    public static void main(String[] args) throws InterruptedException {
        // 定义线程组
        ThreadGroup group = new ThreadGroup("group");
        // 设置为守护线程组
        group.setDaemon(true);

        // 给守护线程组添加3个线程
        for (int i = 0; i < 3; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 20; j++) {
                        System.out.println(Thread.currentThread().getName() + "--" + j);
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
        }

        Thread.sleep(5000);
        System.out.println("main end...");
    }
}
