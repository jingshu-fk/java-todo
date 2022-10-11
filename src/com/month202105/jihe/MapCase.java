package com.month202105.jihe;

import java.util.HashMap;
import java.util.Map;

public class MapCase {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        //1、添加
        map.put("profit", 9300);
        map.put("pear", 43);
        map.put("feifei", 30000);
        System.out.println(map);

        //2、遍历map
        for(String name: map.keySet()) {
            Integer num = map.get(name);
            System.out.println(name + "=" + num);
        }
        // 遍历map
        for(Map.Entry<String, Integer> entry: map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }

        //3、修改
        map.replace("feifei", 13000);
        map.replace("yan", 389);
        System.out.println(map);

        //4、判断map的信息
        System.out.println(map.containsKey("profit"));
        System.out.println(map.containsKey("Profit"));
        System.out.println(map.isEmpty());
        System.out.println(map.size());

        //5、删除
        map.remove("profit");
        map.remove("FeiFei");
        System.out.println(map);
    }
}
