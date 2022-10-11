package com.day0118;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/*
根据name名字获取分数score
知识点：List有序列表使用、Map键值对集合、
 */
public class TestMap {
    public static void main(String[] args) {
        List<Stu> list = new ArrayList<>();
        list.add(new Stu("Bob", 23));
        list.add(new Stu("Alice", 85));
        list.add(new Stu("Brush", 66));
        list.add(new Stu("Newton", 99));
        //迭代输出List列表的值
        for (Stu s : list) {
            System.out.println(s.name);
            System.out.println(s.score);
        }
        Students holder = new Students(list); //实例化类Students,参数是list列表
        System.out.println(holder.getScore("Bob"));
        System.out.println(holder.getScore("Bob") == 23 ? "测试成功": "测试失败");
        System.out.println(holder.getScore("Brush") == 63 ? "测试成功": "测试失败");
        System.out.println(holder.getScore("FK") == 99 ? "测试成功": "测试失败");
    }
}

class Students {
    List<Stu> list;
    HashMap<String, Integer> cache;

    public Students(List<Stu> list) {
        this.list = list;
        cache = new HashMap<>();
    }

    //获取分数：
    public int getScore(String name) {
        Integer score = this.cache.get(name); //#1 先从缓存中查找
        if (score == null) {  //#2 如果找不到
            score = this.findInList(name); //#3 就调用findInList()方法去list列表去找
            if (score != null) { //#4 如果找到的score不是null
                cache.put(name, score);  //#5 添加到缓存map里面。
            }
        }
        return score == null ? -1: score; //#6 score为null返回-1，不是就返回score
    }

    //去list列表去找
    public Integer findInList(String name) {
        for (Stu ss: this.list) {
            if (ss.name.equals(name)) {
                return ss.score;
            }
        }
        throw new NullPointerException(name + "没有记录在案");
    }
}


class Stu {
    public String name;
    public int score;

    public Stu(String name, int score) {
        this.name = name;
        this.score = score;
    }
}
