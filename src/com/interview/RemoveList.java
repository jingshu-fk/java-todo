package com.interview;

import java.util.ArrayList;
import java.util.List;

/**
 * RemoveList
 * @description 列表删除
 * @author shujingping
 * @date 2023/3/30 15:06
 * @version 1.0
 */
public class RemoveList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("公众号");
        list.add("why技术");
        System.out.println("before remove list = " + list);

        list.removeIf(item -> item.equals("公众号"));
        System.out.println("after remove list = " + list);
    }
}
 
