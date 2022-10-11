package com.suanfa.array;

/**
 * @author SHUJINGPING
 * @description 题目2：二维矩阵区域和检索求和，使用前缀数组方法
 */
public class NumMatrix {
    private int[][] preSum;

    public NumMatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        if(m == 0 || n == 0) {
            return;
        }
        preSum = new int[m + 1][n + 1];
        for(int i = 1;i <= m;i++) {
            for(int j = 1;j <= n;j++) {
                preSum[i][j] = preSum[i - 1][j] + preSum[i][j - 1] + matrix[i - 1][j - 1] - preSum[i - 1][j - 1];
            }
        }
    }

    public int sumRegion(int x1, int y1, int x2, int y2) {
        return preSum[x2 + 1][y2 + 1] - preSum[x1][y2 + 1] - preSum[x2 + 1][y1] + preSum[x1][y1];
    }
}
