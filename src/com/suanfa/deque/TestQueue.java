package com.suanfa.deque;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author SHUJINGPING
 */
public class TestQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(5);
        q.offer(13);
        q.offer(8);
        q.offer(6);

        q.poll();
        System.out.println("The first element is:" + q.peek());
    }
}
