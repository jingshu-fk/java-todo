package com.thread.day20211102;

public class SubThread2 extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 1; i<=10000; i++) {
            if (this.isInterrupted()) {
                System.out.println("当前线程的中断标志位true， 我要退出了");
                return;
            }
            System.out.println("sbu thread==>" + i);
        }
    }
}
