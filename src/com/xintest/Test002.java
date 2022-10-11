package com.xintest;

/**
 * @author SHUJINGPING
 * @date 2022.2.9
 */
public class Test002 {
    public static void main(String[] args) {
        int today = 4;
        switch (today){
            case 1:
                System.out.println("今天跑步");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("今天打羽毛球");
                break;
            case 5:
                System.out.println("今天游泳");
            case 6:
            case 7:
                System.out.println("今天休息");
        }
    }
}
