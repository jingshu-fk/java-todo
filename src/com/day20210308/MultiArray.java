package com.day20210308;


import java.util.Arrays;

/**
 * 定义多维数组
 * 输出多维数组可用：Arrays.deepToString();
*/
public class MultiArray {
    public static void main(String[] args) {
        int[][] ns = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 }
        };
		System.out.println(Arrays.deepToString(ns));
    }
}
