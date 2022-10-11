package com.suanfa.array;

import java.util.HashMap;

/**
 * @author SHUJINGPING
 * @description preSum[i] = preSum[j] + k,
 */

public class SubarraySum2 {
    public int sumToKnow(int[] nums, int k) {
        int n = nums.length;
        // map: 前缀和->前缀和出现的次数
        HashMap<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);
        int count = 0, sum0_i = 0;
        for(int i = 0;i < n;i++) {
            sum0_i += nums[i];
            int sum0_j = sum0_i - k;
            // 如果map里面有这个前缀和，就次数加1
            if(preSum.containsKey(sum0_j)) {
                count += preSum.get(sum0_j);
            }
            // 更新map
            preSum.put(sum0_i, preSum.getOrDefault(sum0_i, 0) + 1);
        }
        return count;
    }
}
