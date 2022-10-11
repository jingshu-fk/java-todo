package com.thread.day20211108;

public class ProducerThread2 extends Thread{
    private MyStack stack;

    public ProducerThread2(MyStack stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        while (true) {
            stack.push();
        }
    }
}
