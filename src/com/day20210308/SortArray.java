package com.day20210308;


import java.util.Arrays;

//练习题：冒泡排序数组
//或使用标准库Arrays.sort();
public class SortArray {
    public static void main(String[] args) {
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
		/*
		for (int i = 0;i < ns.length-1;i++) { //要循环几次
			for (int j = 0;j < ns.length-i-1;j++) {  
				if (ns[j] > ns[j+1]) {
					int temp = ns[j];
					ns[j] = ns[j+1];
					ns[j+1] = temp;
				}				
			}
		}
		*/
		System.out.println(Arrays.toString(ns));
		Arrays.sort(ns);
		System.out.println(Arrays.toString(ns));
    }
}
