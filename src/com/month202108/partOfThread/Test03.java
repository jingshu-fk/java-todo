package com.month202108.partOfThread;

/**
 * 2021-08-11
 * 中断线程
 */
public class Test03 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new PyThread();
        t.start();
        Thread.sleep(1000);
        t.interrupt();
        t.join();
        System.out.println("end");
    }
}

class PyThread extends Thread {
    @Override
    public void run() {
        Thread hello = new HelloThread();
        hello.start();
        try {
            hello.join();
        } catch (InterruptedException e) {
            System.out.println("interrupted!");
        }
        hello.interrupt(); //中断Hello的线程，否则会一致进行下去
    }
}


class HelloThread extends Thread {
    @Override
    public void run() {
        int n = 0;
        while(!isInterrupted()) {
            n++;
            System.out.println(n + " hello!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
