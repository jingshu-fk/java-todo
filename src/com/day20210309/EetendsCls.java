package com.day20210309;

/**
 * 面向对象三大特性之一：继承
#1 子类会自动调用父类的构造方法，super()
#2 如果父类没有默认的构造方法，子类就必须显示调用super(参数)
*/
public class EetendsCls {
    public static void main(String[] args) {
        Student s = new Student("小明", 26, 97);
		
    }
}

class Person {
	protected String name;
	protected int age;
	
	public Person (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge(){
		return this.age;
	}	
}

class Student extends Person {
	protected int score;
	
	public Student(String name, int age, int score) {
		//调用父类的构造方法
		super(name, age);
		this.score = score;
	}
}                                    


class PrimaryStudent {
	protected int grade;
	
	public PrimaryStudent(String name, int age, int score, int grade) {
		
	}
}