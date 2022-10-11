package com.thread.day20211108;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SHUJINGPING
 * @Time: 2021-11-08
 * 生产者和消费者模式：
 */
public class MyStack {
    private List list = new ArrayList<>();
    private static final int MAX = 3;

    public synchronized void push() {
        // 如果list满了就等待让消费掉
        while (list.size() >= MAX) {
            System.out.println("数据满了，" + Thread.currentThread().getName() + "begin wait...");
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String data = "data--" + Math.random();
        System.out.println(Thread.currentThread().getName() + "添加了数据：" + data);
        list.add(data);
        this.notifyAll();
    }

    public synchronized void pop() {
        // 如果list没有数据就等待
        while (list.size() == 0) {
            try {
                System.out.println("没有数据，" + Thread.currentThread().getName() + "begin wait...");
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + "出栈数据是：" + list.remove(0));
        this.notifyAll();
    }
}
