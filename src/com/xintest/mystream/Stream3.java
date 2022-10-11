package com.xintest.mystream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author SHUJINGPING
 * @description Stream常用终结方法
 * /**
 *          * Steam流的收集方法
 *          *
 *          * 创建一个ArrayList集合，并添加以下的字符串，字符串中前面是姓名，后面是年龄
 *          * "zhangsan,23"
 *          * "lisi,24"
 *          * "wangwu,25"
 *          * 保留年龄大于等于24岁的人，并将结果收集到Map集合中，姓名为键，年龄为值
 *
 */
public class Stream3 {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>();
        ls.add("zhangsan,23");
        ls.add("lisi,24");
        ls.add("wangwu,25");

        Map<String, Integer> map = ls.stream().filter((String s) -> {
            String[] split = s.split(",");
            int i = Integer.parseInt(split[1]);
            return i >= 24;
                }).collect(Collectors.toMap(
                (String s) -> {
                    return s.split(",")[0];
                },
                (String s) -> {
                    return Integer.valueOf(s.split(",")[1]);
                }));

        map.forEach((String s, Integer i) -> {
            System.out.println(s + "---" + i);
        });
    }
}
