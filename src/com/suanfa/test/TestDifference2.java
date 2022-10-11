package com.suanfa.test;

import com.suanfa.array.Difference;

import java.util.Arrays;

/**
 * @author SHUJINGPING
 * @description 这里与n个航班，它们分别从1到n进行编号。我们这儿有一份航班预定表，表中第i条预定记录
 * bookings[i] = [i, j, k]意味着我们在从i到j的每个航班上预定了k个座位。
 * 返回一个长度为n的数组，按航班编号顺序返回每个航班上预定的座位数。
 *
 * 给你输⼊⼀个⻓度为 n 的数组 nums，其中所有元素都是 0。再给你输⼊⼀个 bookings，⾥⾯是若⼲三元组
 * (i,j,k)，每个三元组的含义就是要求你给 nums 数组的闭区间 [i-1,j-1] 中所有元素都加上 k。请你返
 * 回最后的 nums 数组是多少？
 */
public class TestDifference2 {
    public static void main(String[] args) {
        int[][] bookings = {{1, 2, 10}, {2, 2, 15}};
        int n = 2;
        System.out.println(Arrays.toString(corpFlightBookings(n, bookings)));
    }

    public static int[] corpFlightBookings(int n, int[][] bookings) {
        // nums初始都为0
        int[] nums = new int[n];
        Difference df = new Difference(nums);
        for(int[] booking : bookings) {
            int i = booking[0] - 1;
            int j = booking[1] - 1;
            int val = booking[2];
            df.increment(i, j, val);
        }
        return df.result();
    }
}
