package com.month202105.jihe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/*
集合：
    List：有序列表，类似Python的列表
 */
public class ListCase {
    public static void main(String[] args) {
        List<String> sr = new ArrayList<>();

        //1、 添加元素
        sr.add("gg");
        sr.add("jj");
        sr.add("dd");
        sr.add("mm");
        sr.add("jj");
        System.out.println(sr.isEmpty());
        System.out.println(sr.size());
        System.out.println(sr.contains("dd"));
        //2、 删除元素
        sr.remove("gg");

        //3、 遍历列表
        for(String s: sr) {
            System.out.println(s);
        }

        //4、 在指定索引处添加元素
        sr.add(2, "pig");
        // 删除指定索引的元素
        sr.remove(2);
        System.out.println(sr);

        //5、返回指定位置的元素
        System.out.println(sr.get(3));
        System.out.println(sr.get(sr.size()-1));

        //6、得到一个子列表，不会生成新的，而是原列表的一个视图
        List<String> sublist = sr.subList(0, 3);
        System.out.println(sublist);
        sublist.add(3, "你好");
        sublist.remove(0);
        System.out.println(sr);

        //7、返回元素在列表中第一次出现的位置（索引）
        System.out.println(sr.indexOf("mm"));
        System.out.println(sr.lastIndexOf("你好"));

        //8、 排序
        Collections.sort(sr);
        System.out.println(sr);
    }
}
