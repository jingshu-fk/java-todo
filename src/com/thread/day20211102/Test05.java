package com.thread.day20211102;

public class Test05 {
    public static void main(String[] args) {
        Test05 obj = new Test05();

        new Thread(new Runnable() {
            @Override
            public void run() {
                obj.mm();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                obj.mm22();
            }
        }).start();
    }

    public void mm() {
        synchronized (this){  // 同步代码块
            for (int i = 1; i <= 100; i++) {
                System.out.println(Thread.currentThread().getName() + " -->" + i);
            }
        }
    }

    // 同步方法
    public synchronized void mm22(){
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + " -->" + i);
        }
    }
}
