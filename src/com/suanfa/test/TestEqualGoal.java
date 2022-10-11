package com.suanfa.test;

/**
 * @author SHUJINGPING
 * @description leetcode-33-搜索旋转排序数组--二分
 */
public class TestEqualGoal {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(equalGoal(nums, target));
    }

    public static int equalGoal(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            // nums[mid]是在左部分，还是右部分，还是转化为有序数组里二分查找
            if(nums[0] < nums[mid]) {
                if(nums[0] <= target && target < nums[mid]) {
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            }else {
                if(nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                }else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
