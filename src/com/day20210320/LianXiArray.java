package com.day20210320;


import java.util.Arrays;
import java.util.Scanner;

/*
实现彩票游戏，用户输入需要的数字个数，然后输出号码可能的最大值
返回用户得到的彩票游戏号码
 */

public class LianXiArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do you need to draw? ");
        int k = in.nextInt();

        System.out.println("What is the highest number you can draw? ");
        int n = in.nextInt();
        //把1,2，...，n存放在数组numbers
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            //Math.random()产生一个0-1之间的随机浮点数
            int r = (int) (Math.random() * n);
            result[i] = numbers[r];
            //确保不会再抽取到上面这个数，用数组中的最后一个数覆盖numbers[r]
            numbers[r] = numbers[n - 1];
            n --;
        }
        Arrays.sort(result);
        System.out.println("Bet the following combination. It'll make you rich!");
        for (int r: result) {
            System.out.println(r);
        }
    }
}
