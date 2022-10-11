package com.month202107;


import java.time.LocalDate;

public class PackageTest {
    public static void main(String[] args) {
        Employee harry = new Employee("阿叔", 13000, 2021, 4, 13);
        harry.raiseSalary(0.2);
        System.out.println("name=" + harry.getName() + ",salary=" + harry.getSalary());
    }

}


class Employee {
    private final String name;
    private double salary;
    private final LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public LocalDate getHireDay(){
        return hireDay;
    }

    // 加上奖金的薪水
    public void raiseSalary(double byPercent){
        double raise = salary * byPercent;
        salary += raise;
    }
}