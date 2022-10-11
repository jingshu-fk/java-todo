package com.month202105.duixiang;


public class InterfaceDemo {
    public static void main(String[] args){
        Electronic ele = new XiaoMi("小米");
        ele.run();
        System.out.println("该品牌是：" + ele.getBrand());
    }
}


interface Electronic{
    void run();
    String getBrand();
}

class XiaoMi implements Electronic{
    private final String brand;

    public XiaoMi(String brand){
        this.brand = brand;
    }

    @Override
    public void run() {
        System.out.println(this.brand + "is running");
    }

    @Override
    public String getBrand() {
        return this.brand;
    }
}