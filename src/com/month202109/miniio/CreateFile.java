package com.month202109.miniio;

import java.io.File;
import java.io.IOException;

/*
@Time：2021-09-27
在当前模块下创建aaa.txt文件
 */
public class CreateFile {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\JavaWorkSpace\\StartOne\\src\\com\\month202109\\miniio");
        if(!file.exists()){
            file.mkdirs();
        }

        File newFile = new File(file, "a.txt");
        newFile.createNewFile();
    }
}
