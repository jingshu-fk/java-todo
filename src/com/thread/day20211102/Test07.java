package com.thread.day20211102;

/**
 * @author SHUJINGPING
 * @Time: 2021-11-02
 * @apiNote : sleep睡眠不会释放锁
 */
public class Test07 {
    private int i = 10;
    private Object object = new Object();

    public static void main(String[] args) throws Exception{
        Test07 test = new Test07();
        MyThread thread1 = test.new MyThread();
        MyThread thread2 = test.new MyThread();

        thread1.start();
        thread2.start();
    }

    class MyThread extends Thread {
        @Override
        public void run() {
            synchronized (object) {
                i++;
                System.out.println("i:" + i);
                try {
                    System.out.println("线程" + Thread.currentThread().getName() + "进入睡眠状态");
                    Thread.currentThread().sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程"+Thread.currentThread().getName()+"睡眠结束");
                i++;
                System.out.println("i:" + i);
            }
        }
    }
}
