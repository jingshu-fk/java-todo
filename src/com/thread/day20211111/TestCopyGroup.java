package com.thread.day20211111;

/**
 * @author SHUJINGPING
 * @Time: 2021-11-11
 * 复制线程组的线程
 */
public class TestCopyGroup {
    public static void main(String[] args) {
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();

        ThreadGroup group1 = new ThreadGroup("group1");
        ThreadGroup group2 = new ThreadGroup(mainGroup,"group2");

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
        Thread t2 = new Thread(group1, r, "t2");
        Thread t3 = new Thread(group2, r, "t3");
        t1.start();
        t2.start();
        t3.start();

        Thread[] threadList = new Thread[mainGroup.activeCount()];
        // 把mainGroup线程组的线程复制到数组，不包含子线程组的线程
        mainGroup.enumerate(threadList, false);

        for (Thread thread: threadList) {
            System.out.println(thread);
        }
        System.out.println("------------------------------");

        Thread[] threadGroups = new Thread[mainGroup.activeGroupCount()];
        // 把mainGroup线程组的线程复制到数组，包含子线程组的线程
        mainGroup.enumerate(threadGroups);
        System.out.println("==============================");
        for (Thread threadGroup: threadGroups) {
            System.out.println(threadGroup);
        }
    }
}
