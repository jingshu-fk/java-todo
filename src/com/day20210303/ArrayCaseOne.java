package com.day20210303;


import java.util.Arrays;

/* 遍历数组
for或者for each;
Arrays.toString();
*/
public class ArrayCaseOne {
    public static void main(String[] args) {
       int[] ns = {23, 35, 28, 99};
	   for (int i=0;i<ns.length;i++) {
		   System.out.println(ns[i]);
	   }
	   for (int n: ns) {
		   System.out.println(n);
	   }
	   System.out.println(Arrays.toString(ns));
	   System.out.println(ns.length);
    }
}
