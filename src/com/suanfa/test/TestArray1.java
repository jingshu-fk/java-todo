package com.suanfa.test;

import com.suanfa.array.NumArray2;

/**
 * @author SHUJINGPING
 * @description 测试NumArray2
 */
public class TestArray1 {
    public static void main(String[] args) {
        int[] nums = {3, 5, 2, -2, 4, 1};
        NumArray2 nums2 = new NumArray2(nums);

        System.out.println(nums2.sumRange(1, 4));
    }
}
