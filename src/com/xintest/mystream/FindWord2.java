package com.xintest.mystream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author SHUJINGPING
 * @description 使用stream
 */

public class FindWord2 {
    public List<String> sortGetTop3LongWords(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .filter(word -> word.length() > 5)
                .sorted((o1, o2) -> o2.length() - o1.length())
                .limit(3)
                .collect(Collectors.toList());
    }
}
