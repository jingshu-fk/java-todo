package com.suanfa.test;

/**
 * @author SHUJINGPING
 * @description  使用二分搜索
 * 送带上的包裹必须在 days 天内从一个港口运送到另一个港口。
 *
 * 传送带上的第 i 个包裹的重量为 weights[i]。每一天，我们都会按给出重量（weights）的顺序往传送带上装载包裹。我们装载的重量不会超过船的最大运载重量。
 *
 * 返回能在 days 天内将传送带上的所有包裹送达的船的最低运载能力。
 */
public class TestShipInDays {
    public static void main(String[] args) {
        int[] weights = {7, 2, 5, 10, 8};
        int days = 2;
        System.out.println(shipWithInDays(weights, days));
    }

    public static int shipWithInDays(int[] weights, int days) {
        int left = 0, right = 0;
        for(int w : weights) {
            // left是数组中的最大值，right最大是所有元素的和，一次性搬完
            left = Math.max(left, w);
            right += w;
        }

        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(f(weights, mid) == days) {
                right = mid - 1;
            }else if(f(weights, mid) < days) {
                right = mid - 1;
            }else if(f(weights, mid) > days) {
                left = mid + 1;
            }
        }
        return left;
    }

    public static int f(int[] weights, int x) {
        int days = 0;
        for(int i = 0; i < weights.length;) {
            int cap = x;
            while(i < weights.length) {
                if(cap < weights[i]) {
                    break;
                }else {
                    cap -= weights[i];
                }
                i++;
            }
            days++;
        }
        return days;
    }
}
