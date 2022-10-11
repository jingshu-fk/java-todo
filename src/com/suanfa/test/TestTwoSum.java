package com.suanfa.test;

import java.util.Arrays;

/**
 * @author SHUJINGPING
 * @description
 * 给你一个下标从 1 开始的整数数组 numbers ，该数组已按 非递减顺序排列  ，
 * 请你从数组中找出满足相加之和等于目标数 target 的两个数。如果设这两个数分别是
 * numbers[index1] 和 numbers[index2] ，则 1 <= index1 < index2 <= numbers.length 。
 *
 * 以长度为 2 的整数数组 [index1, index2] 的形式返回这两个整数的下标 index1 和 index2。
 */
public class TestTwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 11};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        // 使用二分搜索，左右指针
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            int sum = nums[left] + nums[right];
            if(sum == target) {
                return new int[]{left + 1, right + 1};
            }else if(sum < target) {
                left++;
            }else {
                right--;
            }
        }
        return new int[]{left + 1, right + 1};
    }
}
