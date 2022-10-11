package com.common;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author SHUJINGPING
 * @description 获取区间内的随机整数
 */

public class RandomInteger {
    public static void main(String[] args) {
        int randomNum = ThreadLocalRandom.current().nextInt(3, 99+1);
        System.out.println(randomNum);
    }
}
