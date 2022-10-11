package com.xintest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SHUJINGPING
 * @description 返回子字符串
 */
public class Test004 {
    public static void main(String[] args) {
        String[] words = {"mass", "as", "hero", "superhero", "good"};
        System.out.println(getAllSubString(words));
    }


    public static List<String> getAllSubString(String[] words) {
        List<String> backWords = new ArrayList<>();
        for(int i=0;i<words.length - 1;i++){
            for(int j=0;j<words.length - 1;j++){
                if(j != i){
                    if(words[j].contains(words[i])) {
                        backWords.add(words[i]);
                        break;
                    }
                }
            }
        }
        return backWords;
    }
}
