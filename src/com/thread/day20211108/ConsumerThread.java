package com.thread.day20211108;

public class ConsumerThread extends Thread{
    private ValueOP obj;

    public ConsumerThread(ValueOP obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        while (true) {
            obj.getValue();
        }
    }
}
