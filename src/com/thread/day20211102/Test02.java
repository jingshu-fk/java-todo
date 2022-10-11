package com.thread.day20211102;
/**
 * 中断线程.
 *
 * @author shujingping
 * @Time: 2021-11-02
 */
public class Test02 {
    public static void main(String[] args) {
        SubThread2 t1 = new SubThread2();
        t1.start();

        for (int i = 1; i<=100; i++) {
            System.out.println("main ==>" + i);
        }

        t1.interrupt(); // 中断线程t1
    }
}
