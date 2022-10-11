package com.testcase;
/**
 * @author SHUJINGPING
 * @version 2021-08-14
游戏规则：
一盘游戏中，两人轮流掷骰子5次，并将每次掷出的点数累加，5局之后，累计点数较大者获胜，点数相同则为平局。
根据此规则实现掷骰子游戏，并算出50盘之后的胜利者（ 50盘中嬴得盘数最多的，即最终胜利者)。

分析：
    1、50盘游戏
    2、每盘游戏5局
    3、每局各自一次比较大小，判断局胜负，5局后分数统计谁多就该盘赢
    4、最后谁赢得盘多就赢

给出每盘胜负结果数据
给出两个玩家的胜负数据
宣布胜者
 */
public class CaseDice {
    public static void main(String[] args) {
        int plateA = 0;
        int plateB = 0;
        for(int i=1;i<=50;i++) {
            int roundA = 0;
            int roundB = 0;
            int draw = 0;
            for(int j=1;j<=5;j++) {
                int testA = 1 + (int)(Math.random() * 5);
                int testB = 1 + (int)(Math.random() * 5);
                if(testA > testB) {
                    roundA += 1;
                }else if(testA < testB){
                    roundB += 1;
                }else {
                    draw += 1;
                }
            }
            System.out.println(String.format("第%d盘a玩家赢了%d局，b玩家赢了%d局,平了%d局;", i, roundA, roundB, draw));
            if(roundA > roundB) {
                plateA += 1;
            }else {
                plateB += 1;
            }
        }
        System.out.println(String.format("a玩家赢了%d盘", plateA));
        System.out.println(String.format("b玩家赢了%d盘", plateB));
        if(plateA > plateB){
            System.out.println("a玩家赢了");
        }else{
            System.out.println("b玩家赢了");
        }
    }
}
