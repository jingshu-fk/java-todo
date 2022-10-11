package com.day0123;

/**
 * @author SHUJINGPING
 * @description
 * 随机生成一个0-9的数字
 * 然后三个人来猜
 * 猜中输出，没有一个人猜中就继续猜
 */
public class GameLauncher {
    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.startGame();
    }
}


class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1lisRight = false;
        boolean p2lisRight = false;
        boolean p3lisRight = false;

        int targetNumber = (int)(Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");

        while(true) {
            System.out.println("Number to guess is " + targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);
            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);
            guessp3 = p3.number;
            System.out.println("Player three guessed " + guessp3);

            if (guessp1 == targetNumber) {
                p1lisRight = true;
            }
            if (guessp2 == targetNumber) {
                p2lisRight = true;
            }
            if (guessp3 == targetNumber) {
                p3lisRight = true;
            }

            if (p1lisRight || p2lisRight || p3lisRight) {
                System.out.println("We have a winner");
                System.out.println("Player one got it right? " + p1lisRight);
                System.out.println("Player two got it right? " + p2lisRight);
                System.out.println("Player three got it right? " + p3lisRight);
                System.out.println("Game is over.");
                break;
            } else {
                System.out.println("Players will have to try again.");
            }
        }
    }
}



class Player {
    int number = 0;

    public void guess() {
        number = (int)(Math.random() * 10);
        System.out.println("I'm guessing" + number);
    }
}


