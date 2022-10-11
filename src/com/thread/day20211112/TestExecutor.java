package com.thread.day20211112;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author SHUJINGPING
 * @Time: 2021-11-12
 * 线程池的创建、基本使用
 */
public class TestExecutor {
    public static void main(String[] args) {
        // 创建一个线程池，有5个线程大小
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5);

        // 向线程池中添加18个任务，18个任务存储到阻塞队列中，
        for (int i = 0; i < 18; i++) {
            fixedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "编号的任务在执行任务,开始时间:"
                    + System.currentTimeMillis());
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
