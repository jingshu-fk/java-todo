package com.month202109;

public class LearnThis {
    public static void main(String[] args) {

    }
}


class Date{
    private int year;
    private int month;
    private int day;

    public Date(){
        this(1970, 1, 1); //使用this关键字调用其他构造方法
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}