package com.testcase;
/*
@Time：2021-8-4
石头、剪刀、布游戏
1、玩家与电脑
2、带有选项的界面
3、对着电脑检查
4、返回获胜者状态
5、询问玩家是否再玩
----------------------------------------------
玩家至少得玩一次
1、电脑的选择是什么
2、玩家的选择是什么
3、比较两个值判断谁赢
4、判断用户是否还继续玩
 */
import java.util.Arrays;
import java.util.Scanner;

public class GuessGame {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to Rock, Paper, Scissors.\n" +
                "Please pick your weapon.");
        String[] options = {"Rock", "Paper", "Scissors"};
        Game game = new Game(options);
        String playAgain = "";
        String[] co = {"y", "n"};
        while(!(playAgain.toLowerCase().equals("n"))) {
            game.play();
            System.out.println("你还想玩吗？");
            System.out.println("想玩输入y，不想玩输入n");
            playAgain = s.next();
            while(!(Arrays.asList(co).contains(playAgain.toLowerCase()))){
                System.out.println("输入数据非法，请输入y或n");
                playAgain = s.next();
            }
        }
    }
}


class Game{
    String[] options;

    public Game(String[] options) {
        this.options = options;
    }

    public int userChoice() {
//        Scanner sc = new Scanner(System.in);
        System.out.println("玩家，请输入你的出法：");
        int userInput = GuessGame.s.nextInt();
        System.out.println("接收到数字:" + userInput);
        while(userInput >= options.length) {
            System.out.println("输入数据不合法，请重新输入你的出法：");
            userInput = GuessGame.s.nextInt();
        }
        return userInput;
    }

    public int computerChoice() {
        return (int)(Math.random() * (options.length + 1));
    }

    public void checkResult(int userResult, int computerResult) {
        if(userResult == computerResult){
            System.out.println("打成平局");
        }else if (userResult == 0 && computerResult == options.length - 1) {
            System.out.println("玩家赢了");
        } else if (userResult > computerResult && !(userResult == options.length - 1 && computerResult == 0)) {
            System.out.println("玩家赢了");
        } else {
            System.out.println("电脑赢了");
        }
    }

    public void play() {
        int userResult = userChoice();
        int computerResult = computerChoice();
        System.out.println("玩家的选择是：" + userResult);
        System.out.println("电脑的选择是：" + computerResult);
        checkResult(userResult, computerResult);
    }
}