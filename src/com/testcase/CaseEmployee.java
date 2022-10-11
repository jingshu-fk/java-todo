package com.testcase;

/**
 * Time: 2021-08-11
 * 一个员工薪水的系统
 */

public class CaseEmployee {
    public static void main(String[] args) {
        Manager m = new Manager();
        System.out.println(m.getSalary());
        Programmer p = new Programmer(120);
        System.out.println(p.getSalary());
        Salesman s = new Salesman(12300);
        System.out.println(s.getSalary());
    }
}

interface AliEmployee{
    double getSalary();
}


class Manager implements AliEmployee {
    @Override
    public double getSalary() {
        return 15000.0;
    }
}


class Programmer implements AliEmployee{
    private final Integer workingHour;

    public Programmer(Integer workingHour) {
        this.workingHour = workingHour;
    }

    @Override
    public double getSalary() {
        return this.workingHour * 200.0;
    }
}


class Salesman implements AliEmployee {
    private final Integer sales;

    public Salesman(Integer sales) {
        this.sales = sales;
//        this.name = name;
    }

    @Override
    public double getSalary() {
        return 1800.0 + this.sales * 0.05;
    }
}




