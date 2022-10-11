package com.month202109.multitest;


public class Master { // 主人喂食狗
    public void feed(Pet pet){  //多态，当宠物种类增加时，方便扩展，不用修改Master
        System.out.println("主人开始喂食！");
        pet.eat();
        System.out.println("主人喂食完毕");
    }
}
