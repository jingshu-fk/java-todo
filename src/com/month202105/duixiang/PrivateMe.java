package com.month202105.duixiang;

/*
private方法；只能在类内部方法里调用
 */

public class PrivateMe {
    public static void main(String[] args) {
        Person p = new Person();  //类实例，并初始化
        p.setBirth(1994);
        System.out.println(p.getAge(2021));
    }
}

class Person{
    private String name;
    private int birth;

    public Person() {
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public int getAge(int currentYear){
        return calAge(currentYear);
    }

    private int calAge(int currentYear) {
        return currentYear - this.birth;
    }

}
