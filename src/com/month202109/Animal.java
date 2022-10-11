package com.month202109;

import java.sql.SQLSyntaxErrorException;

/*
@Time: 2021-9-22
方法覆盖练习
 */
public class Animal {
    public void move(){
        System.out.println("动物在移动！");
    }
}

class Cat extends Animal{
    public void move(){ // 覆盖得和原方法具有相同的返回值类型、方法名、参数类型
        System.out.println("猫在走猫步！");
    }

    public void catchMouse(){
        System.out.println("猫在抓老鼠。");
    }
}

class Bird extends Animal{
    public void move(){
        System.out.println("鸟儿在飞翔");
    }
    public void sing(){
        System.out.println("鸟在唱歌！");
    }
}

