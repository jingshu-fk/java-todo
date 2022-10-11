package com.common;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 迭代器使用——集合
 */
public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> sites = new ArrayList<>();
        sites.add(12);
        sites.add(3);
        sites.add(8);
        sites.add(23);

        Iterator<Integer> it = sites.iterator();
        while (it.next() != null) {
            System.out.println(it.next());
        }
//        while (it.hasNext()) {
//            Integer i = it.next();
//            if(i < 10) {
//                it.remove();
//            }
//        }
//        System.out.println(sites);
    }

}
