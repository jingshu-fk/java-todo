package com.suanfa.test;

import com.suanfa.array.ErFenSearch;

/**
 * @author SHUJINGPING
 */
public class TestErFen {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10, 13, 14, 17, 17};
        int target = 17;
        ErFenSearch es = new ErFenSearch();
        System.out.println(es.leftBound(nums, target));
        System.out.println(es.rightBound(nums, target));
    }
}
