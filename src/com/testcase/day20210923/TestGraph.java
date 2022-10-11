package com.testcase.day20210923;

import java.util.Collections;
/*
@
 */
public class TestGraph {
    public static void main(String[] args) {
        int lay = 9;
        for(int i = 1;i <= (lay+1) / 2;i++){
            for(int j = 1; j < (lay+1)/2 - i;i++){
                System.out.println(" ");
            }
        }
    }
}
