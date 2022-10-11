package com.month202105.jihe;

import java.util.LinkedList;
import java.util.Queue;

/*
Queue:
    1、先进先出，只能从末尾添加，只能从首删除
	2、避免把null添加到队列中
	add()/offer()——添加
	remove()/poll()——获取队首元素并删除
	element()/peek()——获取队首元素但并不删除
 */
public class QueueCase {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.offer("apple");
        q.offer("pear");
        q.offer("banana");
        System.out.println(q.peek());
        System.out.println(q.peek());
        System.out.println(q.peek());
        System.out.println(q.peek());
    }
}
