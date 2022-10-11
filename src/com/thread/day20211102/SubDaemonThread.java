package com.thread.day20211102;

public class SubDaemonThread extends Thread{
    @Override
    public void run() {
        super.run();
        while (true) {
            System.out.println("sub thread ==>");
        }
    }
}
