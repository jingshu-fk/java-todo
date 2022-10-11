package com.suanfa.test;

import com.suanfa.array.Difference;

import java.util.Arrays;

/**
 * @author SHUJINGPING
 * @description 测试差分数组
 */
public class TestDifference {
    public static void main(String[] args) {
//        int[][] updates = {{1, 3, 2}, {2, 4, 3}, {0, 2, -2}};
        int[][] updates = {{1, 3, 3}};
        int[] data = {8, 5, 9, 6, 1};
        System.out.println(Arrays.toString(getModifiedArray(data, updates)));
    }

    public static int[] getModifiedArray(int[] nums, int[][] updates) {
//        int[] nums = new int[data.length];
        Difference df = new Difference(nums);
        for(int[] update : updates) {
            int i = update[0];
            int j = update[1];
            int val = update[2];
            df.increment(i, j, val);
        }
        return df.result();
    }
}
