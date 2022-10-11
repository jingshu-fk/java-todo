package com.suanfa.array;

/**
 * @author SHUJINGPING
 * @description 题目1：数组索引内求和，使用前缀和方法，preSum[i] = nums[0...i-1]的和
 */

public class NumArray2 {
    private final int[] preSum;

    public NumArray2(int[] nums) {
        // 前缀和数组长度确定
        preSum = new int[nums.length + 1];
        preSum[0] = 0;
        // 构造出前缀和数组
        for(int i = 1;i < preSum.length;i++) {
            preSum[i] = preSum[i - 1] + nums[i - 1];
        }
    }

    public int sumRange(int left, int right) {
        return preSum[right + 1] - preSum[left];
    }
}



