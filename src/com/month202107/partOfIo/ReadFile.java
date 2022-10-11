package com.month202107.partOfIo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        try (InputStream input = new FileInputStream("D:\\JavaWorkSpace\\StartOne\\src\\com\\mouth202107\\kis.txt")) {
            // 用缓冲区来一次读取多个字节
            byte[] buffer = new byte[20];
            int n;
            while ((n = input.read(buffer)) != -1) {
                System.out.println("read" + n + "bytes");
            }
        }
    }
}
