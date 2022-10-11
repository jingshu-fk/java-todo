package com.day0119;

import java.util.HashMap;

/**
 * @author SHUJINGPING
 */
public class PracMapEqual {
    public static void main(String[] args) {
        String key1 = "a";
        HashMap<String, Integer> map = new HashMap<>();
        map.put(key1, 21);
        String key2 = new String("a");
        map.get(key2);
        System.out.println(key1 == key2);
        //相同内容的不同对象的value是一样的
        System.out.println(key1.equals(key2));
    }
}
