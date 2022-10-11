package com.thread.day20211102;
/**
 * @author SHUJINGPING
 * @Time: 2021-11-02
 */
public class Test03 {
    public static void main(String[] args) {
        SubDaemonThread thread = new SubDaemonThread();

        thread.setDaemon(true); //得在线程启动之前设置
        thread.start();

        for (int i = 1; i <= 10; i++) {
            System.out.println("main ==>" + i);
        }

        // 主线程运行完毕后，守护线程也就死掉了；
    }
}
