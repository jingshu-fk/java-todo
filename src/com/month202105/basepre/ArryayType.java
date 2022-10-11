package com.month202105.basepre;


public class ArryayType {
    public static void main(String[] args) {
        double[] myList = {1.9, 2.9, 3.4, 3.5};
        //打印所有数组元素
        for(double my: myList) {
            System.out.println(my);
        }
        //计算所有元素的和
        double total = 0;
        for(int i=0;i<=myList.length-1;i++) {
            total += myList[i];
        }
        System.out.println("数组myList所有元素的和为：" + total);

        //查找最大元素
        double maxNum = myList[0];
        for (double v : myList) {
            if (v > maxNum) {
                maxNum = v;
            }
        }
        System.out.println("数组myList的最大元素为：" + maxNum);
    }
}

