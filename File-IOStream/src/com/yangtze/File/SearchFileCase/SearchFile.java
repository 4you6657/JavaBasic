package com.yangtze.File.SearchFileCase;

import java.io.File;
import java.io.IOException;

public class SearchFile {
    public static void main(String[] args) throws Exception {
        searchCertainFile(new File("D:\\"), "QQ.exe");
    }

    /**
     * 去目录下搜索某个文件
     *
     * @param dir      目录（文件夹）
     * @param fileName 要搜索的文件名称
     */
    public static void searchCertainFile(File dir, String fileName) throws Exception {
        // 1、把非法的情况都拦截住
        if (dir == null || !dir.exists() || dir.isFile()) {
            return;
        } // 代表无法搜索

        // 2、dir不是null
        // 获取当前目录下的全部一级文件对象
        File[] firstLevelFiles = dir.listFiles();

        // 3、判断当前目录下是否存在一级文件对象，以及是否可以拿到一级文件对象
        if (firstLevelFiles != null && firstLevelFiles.length > 0) {
            // 4、遍历全部一级文件对象
            for (File file : firstLevelFiles) {
                // 5、判断文件类型
                if (file.isFile()) {
                    // 是文件，判断文件名
                    if (file.getName().contains(fileName)) {
                        System.out.println("要搜索的文件路径为：" + file.getAbsolutePath());
                        Runtime runtime = Runtime.getRuntime();
                        Process p = runtime.exec(file.getAbsolutePath());

                    }
                } else {
                    // 是文件夹，继续重复该过程。
                    searchCertainFile(file, fileName);
                }
            }
        }


    }
}
