package com.suanfa.test;

/**
 * @author SHUJINGPING
 * @description
 * 存在运载能力的下限x1，当x > x1时，可以在day天运送完；当x < x1时，无法再day天运送完
 * 当其小于等于day时，我们就忽略二分的右半部分区间；当其大于day时，我们就忽略二分的左半部分区间。
 */
public class TestShipInDays2 {
    public static void main(String[] args) {
        int[] weights = {3,2,2,4,1,4};
        int day = 3;
        System.out.println(shipInDays(weights, day));
    }

    public static int shipInDays(int[] weights, int day) {
        int left = 0, right = 0;
        // left应该为最大元素，right为所有元素的和
        for(int weight : weights) {
            left = Math.max(weight, left);
            right += weight;
        }
        // left = right + 1越界
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(getDays(weights, mid) == day) {
                right = mid - 1;
            }else if(getDays(weights, mid) > day) {
                left = mid + 1;
            }else if(getDays(weights, mid) < day) {
                right = mid - 1;
            }
        }
        return left;
    }

    public static int getDays(int[] weights, int x) {
        int day = 0;
        for(int i = 0; i < weights.length;) {
            int cap = x;
            // 对于给定的x，每个weights数组的元素与x比较
            while(i < weights.length) {
                if(cap < weights[i]) {
                    break;
                }else {
                    cap -= weights[i];
                }
                i++;
            }
            day++;
        }

        return day;
    }
}
