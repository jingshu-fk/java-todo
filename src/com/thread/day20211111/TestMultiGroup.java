package com.thread.day20211111;

/**
 * @author SHUJINGPING
 * @Time: 2021-11-11
 * Java线程组
 */
public class TestMultiGroup {
    public static void main(String[] args) {
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        System.out.println(mainGroup);

        // 2 不指定时，归属于主线程组
        ThreadGroup group1 = new ThreadGroup("group1");
        System.out.println(group1);
        // 3 指定父线程组
        ThreadGroup group2 = new ThreadGroup(mainGroup, "group2");

        System.out.println(group1.getParent() == mainGroup);
        System.out.println(group2.getParent() == mainGroup);

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread());
            }
        };

        Thread t1 = new Thread(r, "t1");
        System.out.println(t1);
        Thread t2 = new Thread(group1, r, "t2");
        Thread t3 = new Thread(group2, r, "t3");
        System.out.println(t2);
        System.out.println(t3);
    }
}
