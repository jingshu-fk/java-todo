/**
 * @projectName StartOne
 * @package com.xintest.worldcup
 * @className com.xintest.worldcup.Prediction
 */
package com.xintest.worldcup;

import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Prediction
 * @description 预测2022卡塔尔世界杯
 * @author shujingping
 * @date 2022/11/28 10:37 上午
 * @version 1.0
 */
public class Prediction {
    String countryH1 = "荷兰";
    String countryH2 = "阿根廷";

    public HashMap<String, Integer> getResult() {
        HashMap<String, Integer> result = new HashMap<>(16);
        result.put(countryH1, generate());
        result.put(countryH2, generate());
        return result;
    }

    public int generate() {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 3+1);
        return randomNum;
    }
}


 
