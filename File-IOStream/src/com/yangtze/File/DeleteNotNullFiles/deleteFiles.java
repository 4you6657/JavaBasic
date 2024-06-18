package com.yangtze.File.DeleteNotNullFiles;

import java.io.File;

public class deleteFiles {
    public static void main(String[] args) {
        // 需求：删除非空文件夹 （独立功能封装成方法）
        File dir = new File("E:\\JAVA_FILE\\First");
        deleteDir(dir);

    }

    public static boolean deleteDir(File dir) {
        if (dir == null || !dir.exists()) {
            return false;
        }

        if (dir.isFile()) {
            return dir.delete();
        }

        // 1、dir存在且是文件夹，拿里面的一级文件对象。
        File[] files = dir.listFiles();
        if (files == null) {
            return false;
        }

        if (files.length == 0) {
            return dir.delete();
        }

        // 2、有权限访问且不为空，则直接删掉里面的内容，再删除自己
        for (File file : files) {
            if (file.isFile()) {
                return file.delete();
            } else {
                deleteDir(file);
            }
        }
        return dir.delete();
    }

}
