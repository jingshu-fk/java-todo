package com.suanfa.test;

/**
 * @author SHUJINGPING
 * @description leetcode-81-搜搜旋转排序数组II
 */
public class TestSortTarget {

    public static void main(String[] args) {
        int[] nums = {2,5,6,0,0,1,2};
        int target = 2;
        System.out.println(sortTarget(nums, target));
    }

    public static boolean sortTarget(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                return true;
            }

            if(nums[left] == nums[mid] && nums[mid] == nums[right]) {
                left++;
                right--;
            }else if(nums[left] <= nums[mid]) {
                if(nums[left] <= target && target <= nums[mid]) {
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
        return false;
    }
}
