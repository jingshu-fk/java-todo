package com.day0113;

import java.util.Arrays;

public class TestCaseStr {
    public static void main(String[] args) {
        int[] scores = new int[] {32, 12, 44, 56};
        Score s = new Score(scores);
        s.printScores();
        //这直接修改了数组scores
        scores[2] = 99;
        Score p = new Score(scores);
        p.printScores();
    }
}

class Score {
    private int[] scores;

    public Score(int[] scores) {
        this.scores = scores.clone(); //实例化之后使用复制的scores数组
    }

    public void printScores() {
        System.out.println(Arrays.toString(scores));
    }
}
