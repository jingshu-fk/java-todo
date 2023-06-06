package com.xintest.mystream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * @author SHUJINGPING
 * @description   map和flatMap
 * map 必须是一对一的，即每个元素都只能转换为1个新的元素
 * flatMap 可以是一对多的，即每个元素都可以转换为1个或者多个新的元素
 */
public class Stream1 {
    public static void main(String[] args) {
        stringToIntMap();
        testGetTarget();
    }

    public static void stringToIntMap() {
        List<String> sentences = Arrays.asList("hello world","Jia Gou Wu Dao");
        List<String> results = sentences.stream()
                        .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                        .collect(Collectors.toList());
        System.out.println(results);

        System.out.println("----before peek----");
        sentences.stream().peek(sentence -> System.out.println(sentence));
        System.out.println("----after peek----");

        // peek操作后面增加终止操作，peek会执行
        System.out.println("----before peek and count----");
        sentences.stream().peek(sentence -> System.out.println(sentence)).count();
        System.out.println("----after peek and count----");
    }


    public static void testGetTarget() {
        List<String> ids = Arrays.asList("205","10","308","49","627","193","111", "193");
        // collect拼接字符串，其他还行生成List/Set/Map
        String joinResult = ids.stream().collect(Collectors.joining(","));
        System.out.println("拼接后：" + joinResult);
    }
}
