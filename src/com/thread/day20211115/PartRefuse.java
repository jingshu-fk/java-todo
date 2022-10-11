package com.thread.day20211115;

import java.util.Random;
import java.util.concurrent.*;

/**
 * @author SHUJINGPING
 * @Time: 2021-11-15
 * 拒绝策略以及线程池中的线程
 */
public class PartRefuse {
    public static void main(String[] args) throws InterruptedException{
        Runnable r = new Runnable() {
            @Override
            public void run() {
                // 获取一个随机整数值
                int num = new Random().nextInt(5);
                System.out.println(Thread.currentThread().getId() + "--" + System.currentTimeMillis()
                 + "开始睡眠" + num + "秒");
                try {
                    TimeUnit.SECONDS.sleep(num);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        // 创建线程池，默认拒绝策略是抛出异常
        ExecutorService executorService = new ThreadPoolExecutor(5, 5, 0, TimeUnit.SECONDS, new SynchronousQueue<>(), new ThreadFactory() {
            @Override
            // 线程池中的线程从这方法创建而来的
            public Thread newThread(Runnable r) {
                Thread t = new Thread(r);
                t.setDaemon(true);
                System.out.println("创建了线程" + t);
                return t;
            }
        });
        //提交5个任务到线程池，当超过5个时，会抛出异常
        for (int i = 0; i < 6; i++) {
            executorService.submit(r);
        }

        Thread.sleep(10000);
    }
}
