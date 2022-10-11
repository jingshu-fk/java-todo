package com.day20210320;


import java.util.Arrays;
import java.util.Scanner;

// 1、用户给出彩票的位数，以及号码的最值
public class TestArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		System.out.println("输入彩票的位数");
		int n = in.nextInt();
		
		System.out.println("输入彩票号码的最大值");
		int k = in.nextInt();
		
		int[] numbers = new int[k];
		for (int i = 0;i < numbers.length; i++) {
			numbers[i] = i + 1;
		}
		
		int[] results = new int[n];
		for (int i = 0;i < results.length; i++) {
			int r = (int) (Math.random() * n);
			results[i] = numbers[r];
			numbers[r] = numbers[n - 1];
			n --;
		}
		Arrays.sort(results);
		System.out.println(Arrays.toString(results));
		for (int re: results) {
			System.out.println(re);
		}
     }
}
