package com.month202105.testcase;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/*
优先级队列
 */

public class TestCase07 {
    public static void main(String[] args) {
        Queue<User> q1 = new PriorityQueue<>(new UserComparator());
        q1.offer(new User("Bob", "A1"));
        q1.offer(new User("Alice", "A2"));
        q1.offer(new User("Boss", "V1"));
        System.out.println(q1.poll());
        System.out.println(q1.poll());
        System.out.println(q1.poll());
        System.out.println(q1.poll());
    }
}

class UserComparator implements Comparator<User> {
    public int compare(User u1, User u2) {
        if (u1.number.charAt(0) == u2.number.charAt(0)) {
            // 如果两人的号都是A开头或者都是V开头,比较号的大小:
            return u1.number.compareTo(u2.number);
        }
        if (u1.number.charAt(0) == 'V') {
            // u1的号码是V开头,优先级高:
            return -1;
        } else {
            return 1;
        }
    }
}

class User {
    public final String name;
    public final String number;

    public User(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String toString() {
        return name + "/" + number;
    }

}
