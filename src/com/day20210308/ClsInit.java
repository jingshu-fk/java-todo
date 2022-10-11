package com.day20210308;



//面向对象
//一个类通过定义方法，就可以给外部代码暴露一些操作的接口，同时，内部自己保证逻辑一致性。
public class ClsInit {
    public static void main(String[] args) {
        Person p = new Person();
		p.setName("");
		p.setAge(26);
		System.out.println("Hello，你的名字是" + p.getName() + ",年龄是" + p.getAge());
    }
}


class Person {
	//只能内部使用，不用暴露给外部
	private String name;
	private int age;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("Invaild name");
		}
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
