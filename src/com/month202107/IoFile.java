package com.month202107;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

// File对象
public class IoFile {
    public static void main(String[] args) throws IOException {
        File f = new File(".\\");
        System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getCanonicalPath());
        System.out.println(File.separator);

        System.out.println(f.isFile());
        System.out.println(f.isDirectory());

        File[] f1 = f.listFiles(); //列出文件和子目录
        printFiles(f1);

        // path对象
        Path p1 = Paths.get(".", "project", "study");
        System.out.println(p1);
        Path p2 = p1.toAbsolutePath();
        Path p3 = p2.normalize();
        System.out.println(p3);
        File f2 = p3.toFile(); // 转换为File对象
        System.out.println(f2);
    }

    // 输出所有的文件和子目录
    static void printFiles(File[] files) {
        System.out.println("==========");
        if (files != null) {
            for (File f: files) {
                System.out.println(f);
            }
        }
        System.out.println("==========");
    }
}
