package com.thread.day20211105;

/**
 * @author SHUJINGPING
 * @Time: 2021-11-05
 * interrupt会中断wait的等待，抛出中断异常
 */
public class Test02 {
    public static void main(String[] args) throws InterruptedException{
        SubThread t = new SubThread();
        t.start();

        Thread.sleep(2000);
        t.interrupt();
    }

    private static final Object LOCK = new Object();
    static class SubThread extends Thread {
        @Override
        public void run(){
            synchronized (LOCK) {
                try {
                    System.out.println("begin wait...");
                    LOCK.wait();
                    System.out.println("end wait...");
                } catch (InterruptedException e) {
                    System.out.println("wait等待线程被中断了..");
                }
            }
        }
    }
}
