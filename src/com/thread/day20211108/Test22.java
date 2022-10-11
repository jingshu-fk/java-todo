package com.thread.day20211108;

public class Test22 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        ProducerThread2 p = new ProducerThread2(stack);
        ProducerThread2 p2 = new ProducerThread2(stack);
        ProducerThread2 p3 = new ProducerThread2(stack);
        ConsumerThread2 c = new ConsumerThread2(stack);
        ConsumerThread2 c2 = new ConsumerThread2(stack);
        ConsumerThread2 c3 = new ConsumerThread2(stack);

        p.setName("生产者1号");
        p2.setName("生产者2号");
        p3.setName("生产者3号");
        c.setName("消费者1号");
        c2.setName("消费者2号");
        c3.setName("消费者3号");

        p.start();
        p2.start();
        p3.start();
        c.start();
        c2.start();
        c3.start();
    }
}
