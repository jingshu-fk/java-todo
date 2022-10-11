package com.month202112;


import java.util.concurrent.ThreadLocalRandom;

public class ValueTest {
    public static void main(String[] args) {
        Dog aDog = new Dog("Max");
        Dog oldDog = aDog;
        foo(aDog);
        System.out.println(aDog.getName().equals("Max"));
        System.out.println(aDog.getName().equals("Fifi"));
        System.out.println(aDog == oldDog);

        int randomNum = ThreadLocalRandom.current().nextInt(3, 99+1);
        System.out.println(randomNum);
    }

    public static void foo(Dog d) {
        System.out.println(d.getName().equals("Max"));
        d = new Dog("Fifi");
        System.out.println(d.getName().equals("Fifi"));
    }
}


class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
