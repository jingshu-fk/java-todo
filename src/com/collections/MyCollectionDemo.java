package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author SHUJINGPING
 * @description Collections工具类操作
 */
public class MyCollectionDemo {

    public static void main(String[] args) {
        List<String> lt = new ArrayList<String>();
        lt.add("沉默王二");
        lt.add("沉默王三");
        lt.add("沉默王四");
        lt.add("沉默王五");
        lt.add("沉默王六");

        // 1、反转排序
        Collections.reverse(lt);
        System.out.println(lt);

        // 2、自然升序
        Collections.sort(lt);
        System.out.println(lt);

        // 3、打乱
        Collections.shuffle(lt);
        System.out.println(lt);

        System.out.println(Collections.max(lt));
        System.out.println(Collections.min(lt));
        System.out.println(Collections.binarySearch(lt, "沉默王二"));
    }
}
