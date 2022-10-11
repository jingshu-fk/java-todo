package com.month202105.duixiang;


public class MultiType {
    public static void main(String[] args) {
        Figure figure;
        figure = new Rectangle(9, 9);
        System.out.println(figure.area());
        figure = new Triangle(6, 8);
        System.out.println(figure.area());
        figure = new Figure(10, 10);
        System.out.println(figure.area());
    }
}

class Figure {
    double dim1;
    double dim2;

    public Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public double area() {
        System.out.println("父类中计算对象面积的方法，没有实际意义，需要在子类中重写。");
        return 0;
    }
}

class Rectangle extends Figure {
    public Rectangle(double d1, double d2) {
        super(d1, d2);
    }

    public double area() {
        System.out.println("长方形的面积：");
        return super.dim1 * super.dim2;
    }
}

class Triangle extends Figure {
    public Triangle(double d1, double d2) {
        super(d1, d2);
    }

    public double area() {
        System.out.println("三角形的面积：");
        return super.dim1 * super.dim2 / 2;
    }
}
