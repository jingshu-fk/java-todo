package com.month202105.duixiang;

/*
多态的例子；
游戏：英雄
 */

public class ExampleHero {
    public static void main(String[] args){
        Player p = new Player();
//        System.out.println("欢迎来到英雄商店，请选择需要购买的英雄：1.妲己，2.小乔");
//        Scanner scan = new Scanner(System.in);
//        int id = scan.nextInt();
//        Hero h = p.getHero(id);
//        if(null != h) {
//            h.attack();
//        }
        p.bigMove(new LittleJoe(100,10,"小乔"));
        p.bigMove(new DaJi(100,15,"妲己"));
    }


//        Hero daji = new DaJi(100, 15, "妲己");
//        p.play(daji);
//        System.out.println(daji.getName() + "剩余魔法" + daji.getMagicPoint());
//        Hero litterJoe = new LittleJoe(100, 10, "小乔");
//        p.play(litterJoe);
//        System.out.println(litterJoe.getName() + "剩余魔法" + litterJoe.getMagicPoint());

}

//英雄
class Hero {
    private int magicPoint; //魔法值
    private int hurt; //伤害值
    private String name; //英雄名

    public Hero(int magicPoint, int hurt, String name) {
        this.magicPoint = magicPoint;
        this.hurt = hurt;
        this.name = name;
    }

    public int getMagicPoint(){
        return magicPoint;
    }
    public int getHurt(){
        return hurt;
    }
    public String getName() {
        return name;
    }

    public void setMagicPoint(int magicPoint){
        this.magicPoint = magicPoint;
    }

    public void attack(){
        System.out.println(this.getName() + "发动攻击，伤害为：" + this.getHurt() + "消耗魔法值为20");
        this.setMagicPoint(this.getMagicPoint() - 20);
    }
}

//英雄：小乔
class LittleJoe extends Hero{
    public LittleJoe(int magicPoint, int hurt, String name) {
        super(magicPoint, hurt, name);
    }

    public void attack(){
        System.out.println(this.getName() + "发动攻击，伤害为：" + this.getHurt() + "消耗魔法值为20");
        this.setMagicPoint(this.getMagicPoint() - 20);
    }

    public void dazzlingStar(){
        System.out.println("释放发招：星华缭乱");
    }
}

//英雄：妲己
class DaJi extends Hero{
    public DaJi(int magicPoint, int hurt, String name){
        super(magicPoint, hurt, name);
    }

    public void attack(){
        System.out.println(this.getName() + "发动攻击，伤害为：" + this.getHurt() + "消耗魔法值为20");
        this.setMagicPoint(this.getMagicPoint() - 30);
    }

    //给子类添加一个方法
    public void queenWorship(){
        System.out.println("女王释放大招：女王崇拜");
    }
}


//玩家
class Player{
    public void play(Hero hero){
        hero.attack();
    }

    public Hero getHero(int id) {
        if(1 == id) {
            return new DaJi(100, 15, "妲己");
        }else if(2 == id) {
            return new LittleJoe(100, 10, "小乔");
        }else {
            System.out.println("没有这个英雄");
            return null;
        }
    }

    public void bigMove(Hero hero){
        //判断hero是不是可以父类转换对应的子类
        if(hero instanceof DaJi){
            ((DaJi)hero).queenWorship();
        }else if(hero instanceof LittleJoe) {
            ((LittleJoe)hero).dazzlingStar();
        }
    }

}