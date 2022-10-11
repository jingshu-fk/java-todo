package com.thread.day20211102;

public class Test06 {
    public static void main(String[] args) {
        Test06 obj = new Test06();

        new Thread(new Runnable() {
            @Override
            public void run() {
                obj.doLongTimeTask();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                obj.doLongTimeTask2();
            }
        }).start();
    }

    // 同步方法效率低
    public synchronized void doLongTimeTask() {
        try {
            System.out.println("Task Begin 1!");
            Thread.sleep(3000);

            System.out.println("开始同步1");
            for (int i = 1; i<=100; i++) {
                System.out.println(Thread.currentThread().getName() + " -->" + i);
            }
            System.out.println("Task End!");
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // 同步代码块，粒度更细，效率更高
    public void doLongTimeTask2() {
        try {
            System.out.println("Task Begin 2!");
            Thread.sleep(3000);

            System.out.println("开始同步2");
            synchronized (this) {
                for (int i = 1; i<=100; i++) {
                    System.out.println(Thread.currentThread().getName() + " -->" + i);
                }
            }
            System.out.println("Task End!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
