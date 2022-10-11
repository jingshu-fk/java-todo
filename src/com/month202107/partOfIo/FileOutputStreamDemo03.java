package com.month202107.partOfIo;

import java.io.FileOutputStream;
import java.io.IOException;


// 字节流输出
public class FileOutputStreamDemo03 {
    public static void main(String[] args) throws IOException {
        String tePath = "D:\\JavaWorkSpace\\StartOne\\src\\com\\month202107\\partOfIo";
        // 1、创建字节流输出对象, true支持追加写入
        try (FileOutputStream fos = new FileOutputStream(tePath + "\\fos.txt", true)) {
            for (int i=0;i<10;i++){
                fos.write("hello".getBytes());
                fos.write("\r\n".getBytes()); // 2、windows换行
            }
        }
    }
}
