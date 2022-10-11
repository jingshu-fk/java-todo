package com.month202105.testcase;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest01 {
    public static void main(String[] args) {
        String  text = "afdfasfafasfdaczadsfazcvafdfcvfdfdaadvavdavfdaav zcvafdafadfvczxvzvafdafad";

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0;i < text.length(); i++) {
            char cc = text.charAt(i); //取出一个字符
            if(map.containsKey(cc)) { //判断map里面是否包含了这个字符
                Integer count = map.get(cc);
                map.replace(cc, count + 1);
            }else {
                map.put(cc, 1);
            }
        }

        //遍历map输出
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for(Map.Entry<Character, Integer> entry: entrySet) {
            System.out.println( entry.getKey() + " : " + entry.getValue());
        }

    }
}
