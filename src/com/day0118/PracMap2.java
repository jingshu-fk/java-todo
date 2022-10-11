package com.day0118;

import java.util.HashMap;
import java.util.Map;

/**
 * @author SHUJINGPING
 * @Time: 2021-01-18
 * Map数据的遍历
 */
public class PracMap2 {
    public static void main(String[] args) {
        // 创建map
        HashMap<String, Integer> map = new HashMap<>();
        map.put("甲乙", 32);
        map.put("丙丁", 11);
        map.put("主公", 12);
        //输出key和value
//        for (String key: map.keySet()) {
//            Integer value = map.get(key);
//            System.out.println(key + "=" + value);
//        }
        // 遍历Map的key和value
        for(Map.Entry<String, Integer> entry: map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
