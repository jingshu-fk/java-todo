package com.month202109.multitest;


public class Dog extends Pet{ //狗有吃的行为

    public Dog(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println(this.name + "在吃骨头。");
    }
}
