package com.month202105.duixiang;


/*
抽象类的例子：求平面图形的面积、周长
每个图形的方法时不一样的
 */
public class TestAbstract {
    public static void main(String[] args) {
        Graphics2d graphics2d = new Rect(2, 5);
        showInfo(graphics2d);
    }

    public static void showInfo(Graphics2d graphics2d){
        System.out.println("平面图形的信息------------------");
        System.out.println("面积:" + graphics2d.getArea());
        System.out.println( "周长:" + graphics2d.getPerimeter());
    }
}


abstract class Graphics2d{
    public abstract double getArea();
    public abstract double getPerimeter();
}


class Rect extends Graphics2d {
    int width;
    int height;

    public Rect(int width, int height){
        super();
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

