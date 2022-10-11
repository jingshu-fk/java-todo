package com.suanfa.deque;

import java.util.Stack;

/**
 * @author SHUJINGPING
 * @description 用双栈实现一个队列
 */
public class MyQueue {
    private Stack<Integer> s1, s2;

    public MyQueue() {
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
    }

    public void push(int x) {
        s1.push(x);
    }

    /**
     * 返回队头元素
     * @return
     */
    public int peek() {
        if(s2.isEmpty()) {
            // 把s1元素压到s2
            s2.push(s1.pop());
        }
        return s2.peek();
    }

    public int pop() {
        peek();
        return s2.pop();
    }

    public boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}
