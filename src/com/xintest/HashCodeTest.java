package com.xintest;

import java.util.HashMap;
import java.util.Objects;

/**
 * @author SHUJINGPING
 * @description 重写equals方法，就必须也得重写hashCode方法
 */
public class HashCodeTest {
    public static void main(String[] args) {
        Student s1 = new Student(18, "张三");
        HashMap<Student, Integer> scores = new HashMap<>();
        scores.put(s1, 98);
        System.out.println(scores.get(new Student(18, "张三")));
    }
}

class Student {
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(age, name);
//    }
}
