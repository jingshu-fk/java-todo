package com.month202109;
/*
@Time：
向下转型：2021-9-22
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal a1 = new Bird();
        if (a1 instanceof Cat){
            Cat c = (Cat)a1;
            c.catchMouse();
        }else if(a1 instanceof Bird){ //使用instanceof判断类型
            Bird b = (Bird)a1;
            b.sing();
        }
    }
}
