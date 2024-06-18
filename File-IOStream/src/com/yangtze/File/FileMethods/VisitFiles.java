package com.yangtze.File.FileMethods;

import java.io.File;

public class VisitFiles {
    public static void main(String[] args) {
        // public String[] list():  获取当前目录下所有的 “一级文件名称” 到一个字符串数组中去返回
        File f1 = new File("E:\\JAVA_FILE\\First");
        String[] firstLevelFileNames = f1.list();
        for (String fileName : firstLevelFileNames) {
            System.out.println(fileName);
        }

        System.out.println("=== === === === === ===");

        // public File[] listFiles():   (重点) 获取当前目录下所有的 “一级文件对象” 到一个文件对象数组中返回
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }
        /*
            使用listFiles方法时的注意事项
                - 当主调是文件，或者路径不存在时，返回null
                - 当主调是空文件夹时，返回一个长度为0的数组
                - 当主调是一个有内容的文件夹时，将里面所有一级文件和文件夹的路径放在File数组中返回
                - 当主调是一个文件夹，且里面有隐藏文件时，将里面所有文件和文件夹的路径放在File数组中返回，包含隐藏文件
                - 当主调是一个文件夹，但是没有权限访问该文件夹时，返回null
         */
    }
}
