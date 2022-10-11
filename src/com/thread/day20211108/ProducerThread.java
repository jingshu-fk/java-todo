package com.thread.day20211108;

public class ProducerThread extends Thread{
    private ValueOP obj;

    public ProducerThread(ValueOP obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        while (true) {
            obj.setValue();
        }
    }
}
