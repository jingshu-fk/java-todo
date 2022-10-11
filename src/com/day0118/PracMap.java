package com.day0118;

import java.util.HashMap;

public class PracMap {
    public static void main(String[] args) {
        Student s = new Student("xiaoming", 99);
        HashMap<String, Student> map = new HashMap<>();
        map.put("xiaoming", s);
        Student target = map.get("xiaoming");
        System.out.println(target == s);
        System.out.println(target.name);
        Student other = map.get("Bob");  //获取不到
        System.out.println(other);

        System.out.println(map.containsKey("xiaoming"));  //判断key是否存在
    }
}


class Student {
    public String name;
    public int score;
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}