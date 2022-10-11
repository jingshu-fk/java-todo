package com.thread.day20211105;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SHUJINGPING
 * @Time: 2021-11-05
 *
 */

public class Test01 {
    public static void main(String[] args) throws InterruptedException{
        List<String> list = new ArrayList<String>();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (list) {
                    if (list.size() != 5) {
                        System.out.println("线程1开始等待: " + System.currentTimeMillis());
                        try {
                            list.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("线程1被唤醒:" + System.currentTimeMillis());
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (list) {
                    for (int i = 0; i < 10; i++) {
                        list.add("data--" + i);
                        System.out.println("线程2添加了第" + (i+1) + "个数据");

                        if (list.size() == 5) {
                            list.notify();
                            System.out.println("线程2已经发现唤醒通知");
                        }
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        t1.start();
        Thread.sleep(500);
        t2.start();
    }
}
