package com.month202107;

import java.io.File;
import java.util.Date;

/*
File类常用操作
File并不操作文件承载的数据内容，文件内容称为数据，文件自身信息称为元数据
 */
public class File01 {
    public static void main(String[] args) throws Exception{
        String basePath = "D:\\JavaWorkSpace\\StartOne\\src\\com\\month202107";
        File specFile = new File(basePath + "fileio-03.txt");
        if(!specFile.exists()) {
            boolean creFlag = specFile.createNewFile();
            System.out.println("创建："+ specFile.getName()+"; 结果："+creFlag);
        }
        File dirFile = new File(basePath);
        // 判断是否目录
        boolean dirFlag = dirFile.isDirectory();
        if(dirFlag){
            File[] dirFiles = dirFile.listFiles();
            printFileArr(dirFiles);
        }
    }

    private static void printFileArr(File[] fileAddr) {
        if(fileAddr != null && fileAddr.length > 0) {
            for(File file: fileAddr) {
                printFileInfo(file);
            }
        }
    }

    private static void printFileInfo(File file){
        System.out.println("名称" + file.getName());
        System.out.println("路径" + file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println("长度" + file.length());
        System.out.println("文件判断" + file.isFile());
        System.out.println("目录判断" + file.isDirectory());
        System.out.println("最后修改" + new Date(file.lastModified()));
    }
}
