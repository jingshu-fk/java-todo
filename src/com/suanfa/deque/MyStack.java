package com.suanfa.deque;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author SHUJINGPING
 * @description 用队列实现一个栈
 */
public class MyStack {
    private Queue<Integer> q = new LinkedList<Integer>();
    int topElem = 0;

    /**
     * 添加元素到栈顶
     */
    public void push(int x) {
        q.offer(x);
        topElem = x;
    }

    /**
     * 返回栈顶元素
     */
    public int top() {
        return topElem;
    }

    /**
     * pop要从队尾取元素
     * @return int
     */
    public int pop() {
        int size = q.size();
        // 留下队尾2个元素
        while(size > 2) {
            q.offer(q.poll());
            size--;
        }
        // 记录新的队尾元素, 指向的是队列的倒数第二个元素
        topElem = q.peek();
        q.offer(q.poll());
        // 删除之前的队尾元素
        return q.poll();
    }

    public boolean isEmpty() {
        return q.isEmpty();
    }
}
