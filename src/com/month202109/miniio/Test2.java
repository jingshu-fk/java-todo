package com.month202109.miniio;
/*
@time: 2021-09-30
删除多级文件夹
 */
import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        //delete方法
        //只能删除文件和空文件夹.
        //如果现在要删除一个有内容的文件夹?
        //先删掉这个文件夹里面所有的内容.
        //最后再删除这个文件夹
        File src = new File("D:\\JavaWorkSpace\\StartOne\\src\\com\\month202109\\miniio\\test");
        deleteDir(src);
    }

    public static void deleteDir(File src){
        // 获取该文件夹下的文件和文件夹
        File[] files = src.listFiles();
        for (File file: files){
            if (file.isFile()){
                file.delete();
            }else {
                deleteDir(file);
            }
        }
        // 最后删除这个空文件夹
        src.delete();
    }
}
