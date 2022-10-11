package com.suanfa.test;

import com.suanfa.array.NumMatrix;

/**
 * @author SHUJINGPING
 */
public class TestMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}};
        System.out.println(matrix[2][1]);
        NumMatrix numMatrix = new NumMatrix(matrix);
        System.out.println(numMatrix.sumRegion(1, 2, 3, 3));
    }
}
