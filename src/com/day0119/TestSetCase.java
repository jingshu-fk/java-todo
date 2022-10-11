package com.day0119;

import java.util.*;


//实现去除重复消息
public class TestSetCase {
    public static void main(String[] args) {
        List<Message> received  = new ArrayList<>();
        received .add(new Message(1, "hello"));
        received .add(new Message(2, "发工资了吗？"));
        received .add(new Message(2, "发工资了吗？"));
        received .add(new Message(3, "去哪吃饭？"));
        received .add(new Message(3, "去哪吃饭？"));
        received .add(new Message(4, "Bye"));

        // displayMessage是已经去重了消息的List
        List<Message> displayMessage = process(received);
        for (Message message: displayMessage) {
            System.out.println(message.text);
        }
    }

    public static List<Message> process(List<Message> received) {
//        return new ArrayList<>(new HashSet<>(received));
        TreeSet<Message> set = new TreeSet<>(Comparator.comparingInt(m -> m.sequence));
        set.addAll(received);
        return new ArrayList<>(set);
    }
}



class Message {
    public final int sequence;
    public final String text;

    public Message(int sequence, String text) {
        this.sequence = sequence;
        this.text = text;
    }
}
