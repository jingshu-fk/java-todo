package com.month202105.duixiang;

public class FangFa {
    public static void main(String[] args) {
//        int result = getMax(10, 12);
//        System.out.println(result);
//        int number = 100; //基本类型
        int[] arr = {10, 20, 30};
        printArray(arr);
    }

    //有返回值的方法
    public static int getMax(int n, int m) {
        return Math.max(n, m);
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for(int a: arr) {
            if(a == arr[arr.length - 1]) {
                System.out.print(a + "]");
            }else {
                System.out.print(a + ",");
            }

        }
    }

}


