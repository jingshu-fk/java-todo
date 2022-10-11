package com.month202108.partOfThread;

public class TestThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new HisRunnable());
        thread.start();

        for(int i = 1;  i<=1000; i++){
            System.out.println( "main==> " + i);
        }
    }
}

class HisRunnable implements Runnable {
    @Override
    public void run() {
        for(int i = 1;  i<=1000; i++){
            System.out.println( "sub thread --> " + i);
        }
    }
}