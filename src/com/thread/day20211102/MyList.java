package com.thread.day20211102;


import java.util.ArrayList;
import java.util.List;

public class MyList {
    private List<String> list = new ArrayList<String>();

    public void add() {
        list.add("elements");
    }

    public int size() {
        return list.size();
    }
}

