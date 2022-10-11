package com.month202107;

import java.util.ArrayList;
import java.util.List;


public class CoList {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        li.add("舒景平");
        li.add("ps");
        li.add("cass-system");
        li.add(2, "pos");
        for(String si: li) {
            System.out.println(si);
        }
    }
}
