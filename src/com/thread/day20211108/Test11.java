package com.thread.day20211108;

public class Test11 {
    public static void main(String[] args) {
        ValueOP valueOP = new ValueOP();

        ProducerThread p1 = new ProducerThread(valueOP);
        ProducerThread p2 = new ProducerThread(valueOP);
        ProducerThread p3 = new ProducerThread(valueOP);

        ConsumerThread c1 = new ConsumerThread(valueOP);
        ConsumerThread c2 = new ConsumerThread(valueOP);
        ConsumerThread c3 = new ConsumerThread(valueOP);

        p1.start();
        p2.start();
        p3.start();
        c1.start();
        c2.start();
        c3.start();
    }
}
