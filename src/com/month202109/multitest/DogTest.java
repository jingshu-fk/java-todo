package com.month202109.multitest;

public class DogTest {
    public static void main(String[] args) {
        Master mas = new Master();
        Dog d = new Dog("二哈");
        mas.feed(d);
        Cat c = new Cat("舒太奇");
        mas.feed(c);
    }
}
