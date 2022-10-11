package com.suanfa.test;

import com.suanfa.array.SubarraySum;
import com.suanfa.array.SubarraySum2;

/**
 * @author SHUJINGPING
 */
public class TestSubArray {
    public static void main(String[] args) {
//        int[] box = {3, 5, 2, -2, 4, 1};
        int[] box = {1, 1, 1};
//        SubarraySum subarraySum = new SubarraySum();
//        System.out.println(subarraySum.sumToKnow(box, 2));
        SubarraySum2 subarraySum = new SubarraySum2();
        System.out.println(subarraySum.sumToKnow(box,2 ));
    }
}
