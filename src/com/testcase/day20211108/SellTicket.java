package com.testcase.day20211108;

/**
 * @author SHUJINGPING
 * @Time: 2021-11-08
 * 用多线程模拟3个窗口卖100张票的需求，并统计出每个窗口卖的票数
 */
public class SellTicket extends Thread{
    private static int tickets = 100;
    private static final Object obj = new Object();

    @Override
    public void run() {
        int count = 0;
        while (true) {
            synchronized (obj) { //使用同一个对象同步
                if (tickets <= 0) {
                    System.out.println(Thread.currentThread().getName() + "共卖了" + count);
                    break;
                } else {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    tickets--;
                    count++;
                    System.out.println(Thread.currentThread().getName() + "执行了，还剩下" + tickets);
                }
            }
        }
    }
}
