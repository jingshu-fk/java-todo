package com.suanfa.test;

import com.suanfa.array.Difference;

/**
 * @author SHUJINGPING
 * @description
 * 你是⼀个开公交⻋的司机，公交⻋的最⼤载客量为 capacity，沿途要经过若⼲⻋站，给你⼀份乘客⾏程表
 * int[][] trips，其中 trips[i] = [num, start, end] 代表着有 num 个旅客要从站点 start 上⻋，
 * 到站点 end 下⻋，请你计算是否能够⼀次把所有旅客运送完毕（不能超过最⼤载客量 capacity）。
 */
public class TestDifference3 {
    public static void main(String[] args) {
        int capacity = 4;
        int[][] trips = {{2, 1, 5}, {3, 3, 7}};
        System.out.println(carPooling(capacity, trips));
    }

    public static boolean carPooling(int capacity, int[][] trips) {
        int[] nums = new int[1001];
        Difference df = new Difference(nums);
        for(int[] trip : trips) {
            // 乘客数量
            int val = trip[0];
            // 乘客上车开始车站
            int i = trip[1];
            // 乘客在车上的区间应该是trip[1]到trip[2] - 1
            int j = trip[2] - 1;
            df.increment(i, j, val);
        }
        int[] res = df.result();
        // 车上乘客自始至终不能超载
        for(int i = 0; i < res.length; i++) {
            if(res[i] > capacity) {
                return false;
            }
        }
        return true;
    }
}
