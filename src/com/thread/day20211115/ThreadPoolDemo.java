package com.thread.day20211115;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author SHUJINGPING
 * @Time: 2021-11-15
 * 监控线程池的常用方法
 */
public class ThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException{
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getId() + "编号的线程开始执行" +
                        System.currentTimeMillis());
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        ThreadPoolExecutor tp = new ThreadPoolExecutor(2, 5, 0,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(), new ThreadPoolExecutor.DiscardPolicy());

        for (int i = 0; i < 30; i++) {
            tp.execute(r);
            tp.submit(r);
            System.out.println("当前核心线程数量" + tp.getActiveCount() +
                    ",最大线程数" + tp.getMaximumPoolSize() +
                    ",当前线程池大小" + tp.getPoolSize() +
                    ",活动线程数量" + tp.getActiveCount() +
                    ",收到任务数量" + tp.getTaskCount() +
                    ",完成任务数" + tp.getCompletedTaskCount());
        }

        System.out.println("--------------------------------------");
        while (tp.getActiveCount() >= 0) {
            System.out.println("当前线程池核心线程数量: " + tp.getCorePoolSize() +
                    ", 最大线程数:" + tp.getMaximumPoolSize() +
                    ",当前线程池大小:" + tp.getPoolSize() + ",活动线程数量:"
                    + tp.getActiveCount()+ ",收到任务数量:" +
                    tp.getTaskCount());

            Thread.sleep(1000);
        }
    }
}
