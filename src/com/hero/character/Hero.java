package com.hero.character;


public class Hero{
    protected String name;
    protected double hp;
    protected double armor;
    protected int moveSpeed;

    protected Hero(String heroName, double heroHP){
        this.name = heroName;
        this.hp = heroHP;
    }

    protected Hero(String heroName, double heroHP, double armor, int moveSpeed){
        this(heroName, heroHP); //this调用其他的构造方法
        this.armor = armor;
        this.moveSpeed = moveSpeed;
    }

    protected void revive(Hero h) {
        h = new Hero("提莫", 383);
    }
}







