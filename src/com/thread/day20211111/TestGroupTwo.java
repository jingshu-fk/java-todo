package com.thread.day20211111;

/**
 * @author SHUJINGPING
 * @Time: 2021-11-11
 * 线程组的基本操作
 */
public class TestGroupTwo {
    public static void main(String[] args) {
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();

        ThreadGroup group = new ThreadGroup("group");

        Runnable r = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("----当前线程：" + Thread.currentThread());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread t1 = new Thread(r, "t1");
        Thread t2 = new Thread(group, r, "t2");
        t1.start();
        t2.start();

        System.out.println("main 线程组中活动线程数量:" + mainGroup.activeCount());
        System.out.println("group 子线程组中活动线程数量:" + group.activeCount());
        System.out.println("main线程组中子线程组数量:" + mainGroup.activeGroupCount());
        System.out.println("group子线程组中子线程组数量:" + group.activeGroupCount());
        System.out.println("main线程组的父线程组:" + mainGroup.getParent());
        System.out.println("group线程组的父线程组:" + group.getParent());
        // 判断当前线程组是否为参数线程组的父线程组。
        System.out.println(mainGroup.parentOf(mainGroup));
        System.out.println(mainGroup.parentOf(group));
        mainGroup.list();
    }
}
