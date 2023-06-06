package com.xintest;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * SecondNum
 * @description 找出第二大的数字  [3, 8, 2, 9, 12]
 * @author shujingping
 * @date 2022/12/14 10:39 上午
 * @version 1.0
 */
public class SecondNum {
    public static void main(String[] args) {
        int[] array = {6, 8, 11, 10, 12};
        System.out.println("数组第二大的元素是：" + getNum(array));
    }

    public static Integer getNum(int[] arr) {
        int max = arr[0];
        ArrayList<Integer> ai = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            ai.add(arr[i]);
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        ai.remove(ai.indexOf(max));
        int max_2 = ai.get(0);
        for (int j = 0; j < ai.size(); j++) {
            if (max_2 < ai.get(j)) {
                max_2 = ai.get(j);
            }
        }
        return max_2;
    }
}
 
