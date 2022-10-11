package com.testcase;
/*
@Time：2021-8-6
单词不区分大小写；
需要把标点过滤；
出现次数最多的单词，可能有多个；
排除banned；
 */


import java.util.*;

public class FilterWord {
    public static void main(String[] args) {
        String testWords = "Bob hit a         ball , the hit a BALL flew far hit it was after.";
        String banned = "hit";
        getFilterWord(testWords, banned);
    }

    public static void getFilterWord(String words, String ingoreWord){
        HashMap<String, Integer> theWord = new HashMap<>();
        // 把标点符号替换为空格
        words = words.replaceAll("[\\pP\\p{Punct}]", " ");
        System.out.println(words);
        words = words.toLowerCase();
        // 以空格或多个空格分隔字符串，放入数组中
        String[] wordList = words.split("\\s+");
        for(String word: wordList) {
//            System.out.println(word);
            if(!theWord.containsKey(word)){
                theWord.put(word, 1);
            }else{
                theWord.replace(word, theWord.get(word) + 1);
            }
        }
        Collection<Integer> collection = theWord.values();
        Integer maxValue = Collections.max(collection);

        List<String> maxWord = new ArrayList<>();
        List<String> keyWord = new ArrayList<>();
        // 遍历map
        for(Map.Entry<String, Integer> entry: theWord.entrySet()){
            if(maxValue.equals(entry.getValue())) {
                if(entry.getKey().equals(ingoreWord)){
                    maxWord.add(entry.getKey());
                }
            }
//            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        for(String mw: maxWord){
            theWord.remove(mw);
        }
        Collection<Integer> t = theWord.values();
        maxValue = Collections.max(t);

        for(Map.Entry<String, Integer> entry: theWord.entrySet()){
            if(maxValue.equals(entry.getValue())) {
                if(!(entry.getKey().equals(ingoreWord))){
                    keyWord.add(entry.getKey());
                }
            }
        }
        System.out.println(keyWord);
    }
}
