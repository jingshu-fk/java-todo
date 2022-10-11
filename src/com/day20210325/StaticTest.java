package com.day20210325;

public class StaticTest {
    public static void main(String[] args) {

    }
}


class Elliot {
    private static int nextId = 1;
    private String name;
    private double salary;
    private int id;

    public Elliot(String n, double s) {
        name = n;
        salary = s;
        id = 0;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void main(String[] args) {
        Elliot e = new Elliot("Harry", 50000);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}