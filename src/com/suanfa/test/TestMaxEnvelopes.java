package com.suanfa.test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author SHUJINGPING
 */
public class TestMaxEnvelopes {

    public int maxEnvelopes(int[][] envelopes) {
        int n = envelopes.length;
        // 按宽度升序排列，如果宽度⼀样，则按⾼度降序排列
        Arrays.sort(envelopes, new Comparator<int[]>()
        {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] == b[0] ?
                        b[1] - a[1] : a[0] - b[0];
            }
        });

        // 对高度数组寻找LIS
        int[] height = new int[n];
        for(int i = 0; i < n; i++) {
            height[i] = envelopes[i][1];
        }

        return lengthOfLis(height);
    }

    /**
     * 返回nums中LIS的长度
     */
    public int lengthOfLis(int[] nums) {
        int piles = 0;
        int n = nums.length;
        int[] top = new int[n];
        for (int poker : nums) {
            // 要处理的扑克牌
            int left = 0, right = piles;
            // 二分查找插入位置
            while (left < right) {
                int mid = (left + right) / 2;
                if (top[mid] >= poker) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            if (left == piles) {
                piles++;
            }
            // 把这张牌放到牌堆顶
            top[left] = poker;
        }

        return piles;
    }
}
