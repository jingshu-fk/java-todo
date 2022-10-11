package com.month202105.duixiang;


public class AbstractMethod {
    public static void main(String[] args) {
        Animal an = new Cat();
        an.run();
    }

}

abstract class Animal{
    public abstract void run();
}

class Cat extends Animal{
    @Override
    public void run() {
        System.out.println("我已经覆写了抽象类的方法");
    }
}
