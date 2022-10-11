package com.month202107.partOfIo;

import java.io.IOException;
import java.io.Reader;

/*
Reader——FilerReader,字符流：读
 */
public class FileReader {
    public static void main(String[] args) throws IOException {
        String tempPath = "D:\\JavaWorkSpace\\StartOne\\src\\com\\month202107";
        try(Reader reader = new java.io.FileReader(tempPath + "\\kis.txt")) {
            char[] buffer = new char[3];
            int n;
            while((n = reader.read(buffer)) != -1) {
                System.out.println("read" + n + "chars");
            }
        }
    }
}
