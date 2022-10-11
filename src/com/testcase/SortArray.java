package com.testcase;

/*
给一个数组，如果数组中有0，则在0后面追加一个0，整体的数组长度不变，要求不能生成新的数组，只能在当前数组下操作
输入：
arr = [1, 2, 4, 0, 5, 0, 9, 6]
期望输出：
[1,2,4,0,0,5,0,0]
 */

import java.util.ArrayList;
import java.util.List;

public class SortArray {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(4);
        li.add(0);
        li.add(5);
        li.add(0);
        li.add(9);
        li.add(6);
        System.out.println(getArray(0, li));
//        getArray(0, li);
    }

    public static Object getArray(int index, List<Integer> arr) {
        if(index > arr.size() - 1) {
            return arr;
        }
        while (index < arr.size()) {
            if(arr.get(index).equals(0)) {
                arr.add(index +1, 0);
                arr.remove(arr.size()-1);
                index++;
            }
            return getArray(index +2, arr);
        }
        return null;
    }
}
