package com.thread.day20211108;


public class ValueOP {
    private String value = "";

    public void setValue() {
        synchronized (this) {
            while (!value.equalsIgnoreCase("")) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            String value = System.currentTimeMillis() + "-" + System.nanoTime();
            System.out.println("set设置的值是：" + value);
            this.value = value;
            this.notifyAll();
        }
    }

    public void getValue() {
        synchronized (this) {
            while (value.equalsIgnoreCase("")) {
                try {
                    this.wait();
                } catch (InterruptedException e ){
                    e.printStackTrace();
                }
            }
            System.out.println("get的值是：" + value);
            this.value = "";
            this.notifyAll();
        }
    }
}
