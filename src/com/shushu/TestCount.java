package com.shushu;


//蜗牛白天爬5米，晚上掉3.5米，井深56.7米；
public class TestCount {
    public static void main(String[] args) {
        int day = 0;
        double sum = 0;
        while (true) {  //当条件满足，继续循环
            sum += 5;
            if (sum > 56.7) {
                break;
            }
            sum -= 3.5;
            day++;
        }
        System.out.println(day);
    }
}
