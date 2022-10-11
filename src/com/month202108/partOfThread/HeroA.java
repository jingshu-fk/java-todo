package com.month202108.partOfThread;

public class HeroA {
    private String name;
    public float hp;
    public int damage;


    public synchronized void recover() {
        hp = hp + 1;
    }

    public void hurt() {
        synchronized (this) {
            hp = hp - 1;
        }
    }

    public void attackHero(HeroA h){
        h.hp -= damage;
        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n",name,h.name,h.name,h.hp);
        if(h.isDead()) {
            System.out.println(h.name + "死了！");
        }
    }

    public boolean isDead(){
        return 0 >= hp;
    }
}