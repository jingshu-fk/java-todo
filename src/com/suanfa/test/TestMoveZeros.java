package com.suanfa.test;

import java.util.Arrays;

/**
 * @author SHUJINGPING
 */
public class TestMoveZeros {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        // for循环的初始表达式变量在外面声明了
        int p = TestRemoveElement.removeElement(nums, 0);
        for(; p < nums.length; p++) {
            nums[p] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
