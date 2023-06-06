package com.xintest.mystream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * sortGetTop3LongWords
 * @description 从给定句子中返回单词长度大于5的单词列表，按长度倒序输出，最多返回3个
 * @author shujingping
 * @date 2023/4/7 10:38
 * @version 1.0
 */
public class SortGetTop3LongWords {
    public List<String> sortGetTop3LongWords(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .filter(word -> word.length() > 5)
                .sorted((o1, o2) -> o2.length() - o1.length())
                .limit(3)
                .collect(Collectors.toList());
    }
}
 
