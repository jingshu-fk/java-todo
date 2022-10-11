package com.day20210308;


//构造方法：在类的实例化时初始化字段；方法名和类名相同
//#1 构造方法没有返回值
//#2 任何类都带默认构造方法，当自己定义了的话，就不会使用默认的
//#3 构造方法还可以调用其他的构造方法，便于代码复用;调用时使用this(...)
public class gouzao {
    public static void main(String[] args) {
        Younger p = new Younger("小舒");
		System.out.println("名字是" + p.getName());		
//		System.out.println("我的名字是" + p.getName() + ",年龄是" + p.getAge());
    }
}



class Younger {
	private String name;
	private int age;
	
	public Younger(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Younger(String name) {
		this(name, 18);  //调用Younger(name, age)
	}
	
	public Younger() {
		this("Unnamed"); //调用了Younger(name)
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
}