package com.suanfa.array;

/**
 * @author SHUJINGPING
 * @description 二分搜索
 */
public class ErFenSearch {
    public int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                return mid;
            }else if(nums[mid] < target) {
                left = mid + 1;
            }else if(nums[mid] > target) {
                right = mid - 1;
            }
        }
        return -1;
    }

    public int leftBound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        // 终止循环条件是left = right + 1，会越界
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                // 别返回，锁定左侧边界
                right = mid - 1;
            }else if(nums[mid] < target) {
                left = mid + 1;
            }else if(nums[mid] > target) {
                right = mid - 1;
            }
        }
        if(left >= nums.length || nums[left] != target) {
            return -1;
        }
        return left;
    }

    public int rightBound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                // 锁定右侧边界
                left = mid + 1;
            }else if(nums[mid] < target) {
                left = mid + 1;
            }else if(nums[mid] > target) {
                right = mid - 1;
            }
        }
        if(right <= 0 || nums[right] != target) {
            return -1;
        }
        return right;
    }
}
