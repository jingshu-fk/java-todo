package com.suanfa.array;

/**
 * @author SHUJINGPING
 * @description 题目3：给出一个整数数组，求和为k的连续子数组的个数;这里不只包含前缀和，还有后缀
 */
public class SubarraySum {
    public int sumToKnow(int[] nums, int k){
        int n = nums.length;
        int[] preSum = new int[n+ 1];
        preSum[0] = 0;
        for(int i = 1;i < preSum.length;i++){
            preSum[i] = preSum[i - 1] + nums[i - 1];
        }

        int count = 0;
        // 这里遍历了前缀和数组，相减得到字数组的和
        for(int i = 1;i <= n;i++) {
//            if(preSum[i] == k) {
//                count++;
//            }
            for(int j = 0;j < i;j++) {
                if(preSum[i] - preSum[j] == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
