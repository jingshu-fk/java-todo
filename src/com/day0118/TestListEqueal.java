package com.day0118;

import java.util.ArrayList;
import java.util.List;


public class TestListEqueal {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("xiaoming"));
        list.add(new Person("xiaobai"));
        list.add(new Person("xiaohui"));
        //这里的Person类并未实现equals()方法的覆写
        System.out.println(list.contains(new Person("xiaobai")));
    }
}

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}

