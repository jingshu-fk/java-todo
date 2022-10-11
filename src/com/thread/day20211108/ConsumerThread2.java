package com.thread.day20211108;

public class ConsumerThread2 extends Thread{
    private MyStack stack;

    public ConsumerThread2(MyStack stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        while (true) {
            stack.pop();
        }
    }
}
