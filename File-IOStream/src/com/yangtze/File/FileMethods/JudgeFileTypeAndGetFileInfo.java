package com.yangtze.File.FileMethods;

import java.io.File;
import java.text.SimpleDateFormat;

public class JudgeFileTypeAndGetFileInfo {
    /*
        判断文件类型、获取文件信息
            - public boolean exists()   :   判断当前文件对象对应的文件路径是否存在，存在则返回true
            - public boolean isFile()   :   判断当前文件对象指代的是否是文件，是文件返回true
            - public boolean isDirectory()  :   判断当前文件对象指代的是否是文件夹，是文件夹返回true
            - public String getName()   :   获取文件的名称（包括后缀）
            - public long length()    :   获取文件的大小，返回字节个数
            - public long lastModified()  :   获取文件的最后修改时间
            - public String getPath() :   获取创建文件对象时，使用的路径
            - public String getAbsolutePath() :   获取绝对路径
     */
    public static void main(String[] args) {
        File f1 = new File("E:" + File.separator + "JAVA_FILE" + File.separator + "TEST.txt");
        System.out.println(f1.exists());
        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());
        System.out.println(f1.getName());
        System.out.println(f1.length());
        System.out.println("=== === === === === ===");
        // 获取文件的最后修改时间
        long time = f1.lastModified();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(time));
        System.out.println("=== === === === === ===");

        // getPath() 获取创建文件对象时，使用的路径
        File f2 = new File("D:" + File.separator + "JAVA_FILE" + File.separator + "YangtzeLogs.txt");
        File f3 = new File("File-IOStream\\src\\yangtze.txt");
        System.out.println(f2.getPath());
        System.out.println(f3.getPath());
        System.out.println("=== === === === === ===");
        System.out.println(f2.getAbsolutePath());
        System.out.println(f3.getAbsolutePath());

    }
}
