package com.suanfa.array;

/**
 * @author SHUJINGPING
 * @description 给定一个整数数组，以及索引i,j，求nums[i]到nums[j]的和
 */
public class NumArray {
    private int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right){
        int res = 0;
        for(int i = left; i <= right; i++){
            res += nums[i];
        }
        return res;
    }
}
