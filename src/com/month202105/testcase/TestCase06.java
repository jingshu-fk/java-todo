package com.month202105.testcase;

import java.util.*;

public class TestCase06 {
    public static void main(String[] args) {
        List<Message> received = new ArrayList<>();
        received.add(new Message(1, "发工资了吗"));
        received.add(new Message(2, "今天学习了吗"));
        received.add(new Message(3, "看书了吗"));
        received.add(new Message(3, "看书了吗"));
        received.add(new Message(4, "Bye"));
        System.out.println(received);

        List<Message> listMessage = process(received);
        for(Message message: listMessage) {
            System.out.println(message.text);
        }
    }

    static List<Message> process(List<Message> received) {
        // 列表转为Set自动去重,这里的Message类就必须得实现equals()、hashCode()
        Set<Message> teSet = new HashSet<>(received);
        return new ArrayList<>(teSet);
    }
}



class Message {
    public final int sequence;
    public final String text;

    public Message(int sequence, String text) {
        this.sequence = sequence;
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message)) return false;
        Message message = (Message) o;
        return sequence == message.sequence &&
                Objects.equals(text, message.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sequence, text);
    }
}