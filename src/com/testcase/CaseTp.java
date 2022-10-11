package com.testcase;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class CaseTp {
    public static void main(String[] args) {
        String test_words = "Bob hit a ball, the hit a BALL flew far after it was hit.";
        String banned = "hit";
        test_words = test_words.toLowerCase(Locale.ROOT);
        test_words = test_words.replace(","," ");
        test_words = test_words.replace("."," ");
        test_words = test_words.replace("  "," ");
        test_words = test_words.replace("  ","");
        test_words = test_words.trim();
        String words[] = test_words.split(" ");
        Map<String,Integer> map = new HashMap<>();
        Arrays.stream(words).forEach(item->{
            if (item.equals(banned)){
                return;
            }
            if (map.get(item)==null){
                map.put(item,1);
            }else{
                map.put(item,map.get(item)+1);
            }
        });

        System.out.println(map);
    }
}
