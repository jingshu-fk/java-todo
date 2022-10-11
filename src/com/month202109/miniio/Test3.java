package com.month202109.miniio;
/*
@time: 2021-09-30
@theme: 统计一个文件夹中每种文件的个数并打印
    定义一个方法,参数是HashMap集合用来统计次数和File对象要统计的文件夹
    遍历File对象,获取它下边的每一个文件和文件夹对象
    判断当前File对象是文件还是文件夹
    如果是文件,判断这种类型文件后缀名在HashMap集合中是否出现过
    没出现过,将这种类型文件的后缀名存入集合中,次数存1
    出现过,获取这种类型文件的后缀名出现的次数,对其+1,在存回集合中
    如果是文件夹,递归调用自己,HashMap集合就是参数集合,File对象是当前文件夹对象
 */
import java.io.File;
import java.util.HashMap;

public class Test3 {
    public static void main(String[] args) {
        File file = new File("F:\\应急云化\\下发机用java程序改造");
        HashMap<String, Integer> hm = new HashMap<>();
        countDir(hm, file);
        System.out.println(hm);
    }

    public static void countDir(HashMap<String, Integer> hm, File src) {
        File[] files = src.listFiles();
        for (File f: files) {
            if (f.isFile()){
                String fileName = f.getName();
                String[] fileNameArr = fileName.split("\\.");
                if(fileNameArr.length == 2){
                    String fileEndName = fileNameArr[1]; //获取到后缀名
                    if (hm.containsKey(fileEndName)) {
                        Integer count = hm.get(fileEndName);
                        count++;
                        hm.put(fileEndName, count);
                    }else {
                        hm.put(fileEndName, 1);
                    }
                }
            }else {
                countDir(hm, f);
            }
        }
    }
}
