package com.day0112;

public class TestGroup {
    public static void main(String[] args) {
        make();
    }

    //1,2,3,4可以组成得3位数，不相同
    public static void make() {
        for (int i=1;i<=4;i++) {
            for (int j=1;j<=4;j++) {
                for (int k=1;k<=4;k++) {
                    if (i!=j && j!=k && k!=i) {
                        System.out.println("1,2,3,4可组成数字"+i+j+k);
                    }
                }
            }
        }
    }
}
