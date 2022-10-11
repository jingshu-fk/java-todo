package com.month202107;


/*
测试Manager类
 */
public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("舒景平", 21000, 2021, 7, 11);
        boss.setBonus(5000);
        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10 , 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3 , 15);
        for (Employee e: staff){
            System.out.println(e.getName() + "=" +  e.getSalary());
        }
    }
}
