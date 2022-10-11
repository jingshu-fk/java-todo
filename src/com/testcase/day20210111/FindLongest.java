package com.testcase.day20210111;
/*
@Time: 2021-10-11
输入：字符串列表
输出：最长的字符串公共前缀
 */
import java.util.ArrayList;
import java.util.List;

public class FindLongest {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("flower");
        ls.add("flight");
        ls.add("flow");
        System.out.println(findLongest(ls));
    }

    public static String findLongest(List<String> poc){
        if(poc.size() == 0) {
            return " ";
        }else if(poc.size() == 1){
            return poc.toString();
        }else {
            String ans = poc.get(0);
            poc.remove(ans);
            for(String an: poc){
                while(!an.contains(ans) || an.indexOf(ans) != 0) {
                    ans = ans.substring(0, ans.length()-1);
                    if (ans.equals(" ")) {
                        return " ";
                    }
                }
            }
            return ans;
        }
    }
}
