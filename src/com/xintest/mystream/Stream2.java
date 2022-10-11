package com.xintest.mystream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author SHUJINGPING
 * @description Stream流中间方法
 */
public class Stream2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");

        // 1 把张开头的元素输出
        list.stream().filter(s -> s.startsWith("张")).forEach(System.out::println);
        System.out.println("------");

        // 2 把张开头且长度为3的元素输出
        list.stream().filter(s -> s.length() == 3).filter(s -> s.startsWith("张")).forEach(System.out::println);
        System.out.println("------");

        // 3 取前3个元素输出
        list.stream().limit(3).forEach(System.out::println);
        System.out.println("------");

        // 4 跳过3个元素输出
        list.stream().skip(3).forEach(System.out::println);
        System.out.println("------");

        // 5 跳过2个元素，剩下的元素前两个输出
        list.stream().skip(2).limit(2).forEach(System.out::println);
        System.out.println("------");

        // 6 取前4个数据组成一个流，跳过前两个数据组成一个流，然后合并两个流输出，去重
        Stream<String> s1 = list.stream().limit(4);
        Stream<String> s2 = list.stream().skip(2);

        Stream.concat(s1, s2).distinct().forEach(System.out::println);
    }
}
