package com.xintest.mystream;


import java.util.ArrayList;
import java.util.List;

/**
 * @author SHUJINGPING
 * @description 找出句子中单词长度超过5的，按长度倒序输出，返回3个
 */
public class FindWord {

    public List<String> sortGetTop3LongWords(String sentence) {
        String[] words = sentence.split(" ");
        List<String> wordsList = new ArrayList<String>();
        for(String word : words) {
            if(word.length() > 5) {
                wordsList.add(word);
            }
        }

        wordsList.sort((o1, o2) -> o2.length() - o1.length());
        if (wordsList.size() > 3) {
            wordsList = wordsList.subList(0, 3);
        }

        return wordsList;
    }
}



