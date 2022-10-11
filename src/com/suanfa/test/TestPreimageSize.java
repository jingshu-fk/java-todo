package com.suanfa.test;

/**
 * @author SHUJINGPING
 */
public class TestPreimageSize {
    public static void main(String[] args) {
        System.out.println(preimageSize(1));
    }

    public static int preimageSize(int k) {
        return (int)(rightBound(k) - (leftBound(k) + 1));
    }

    public static long trailingZeroes(long n) {
        long res = 0;
        for(long d = n; d / 5 > 0; d = d / 5) {
            res += d / 5;
        }
        return res;
    }

    public static long leftBound(int target) {
        long lo = 0, hi = Long.MAX_VALUE;
        while(lo < hi) {
            long mid = lo + (hi - lo) / 2;
            if(trailingZeroes(mid) > target) {
                hi = mid;
            }else if(trailingZeroes(mid) < target) {
                lo = mid + 1;
            }else {
                hi = mid;
            }
        }
        return lo;
    }

    public static long rightBound(int target) {
        long lo = 0, hi = Long.MAX_VALUE;
        while(lo < hi) {
            long mid = lo + (hi - lo) / 2;
            if(trailingZeroes(mid) > target) {
                hi = mid;
            }else if(trailingZeroes(mid) < target) {
                lo = mid + 1;
            }else {
                lo = mid + 1;
            }
        }
        return lo - 1;
    }
}
