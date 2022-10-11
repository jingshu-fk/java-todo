package com.suanfa.array;

/**
 * @author SHUJINGPING
 * @description 差分数组：比如给一个数组的区间nums[i, j]增减，问数组的值
 */
public class Difference {
    private final int[] diff;

    /**
     *
     * @param nums：原始数组
     */
    public Difference(int[] nums) {
        assert nums.length > 0;
        diff = new int[nums.length];
        diff[0] = nums[0];
        for(int i = 1;i < diff.length;i++) {
            diff[i] = nums[i] - nums[i - 1];
        }
    }

    public void increment(int i, int j, int val) {
        // diff[i] = num[i] - num[i - 1]
        // num[i] = diff[i] + num[i - 1]，所以diff[i]加上n，就是num[i]及后面的所有数加n；
        diff[i] += val;
        if(j + 1 < diff.length) {
            diff[j + 1] -= val;
        }
    }

    public int[] result() {
        int[] res = new int[diff.length];
        res[0] = diff[0];
        for(int i = 1;i < diff.length;i++) {
            res[i] = res[i - 1] + diff[i];
        }
        return res;
    }
}

