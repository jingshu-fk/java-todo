package com.month202107.partOfIo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;


// OutputStream输出流
public class WriteFile {
    public static void main(String[] args) throws IOException {
        String tempPath = "D:\\JavaWorkSpace\\StartOne\\src\\com\\month202107";
        // 会把文件里的内容覆盖掉
        try(OutputStream output = new FileOutputStream(tempPath + "\\kis.txt")) {
            output.write("Hello".getBytes(StandardCharsets.UTF_8));
        }
    }
}
