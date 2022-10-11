package com.common;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Array数组转为List列表
 */
public class ArrayToList {
    public static void main(String[] args) {
        Integer[] array = {5, 3, 7, 6, 13};
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(array));
        System.out.println(Arrays.toString(array));
        System.out.println(al);
    }
}
