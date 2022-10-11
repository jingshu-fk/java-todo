package com.month202108.partOfThread;

import java.time.LocalDate;

/**
 * 2021-08-11
 * 守护线程
 * 守护线程不能单独运行;
 * 守护线程是指为其他线程服务的线程。在JVM中，所有非守护线程都执行完毕后，无论有没有守护线程，虚拟机都会自动退出。
 * 守护线程不能持有任何需要关闭的资源，例如打开文件等，因为虚拟机退出时，守护线程没有任何机会来关闭文件，这会导致数据丢失。
 * 线程标记为“守护线程”，就是当他是一个“后台线程”or“内部线程”
 */
public class SetDaemon {
    public static void main(String[] args) throws InterruptedException {
        Thread t2 = new TimerThread();
        t2.setDaemon(true);
        t2.start();

        for(int i=0;i<=10;i++) {
//            Thread.sleep(100);
            System.out.println("main=" + i);
        }
    }
}


class TimerThread extends Thread {
    @Override
    public void run() {
        super.run();
        while (true) {
            System.out.println("sub thread...");
        }
    }
}