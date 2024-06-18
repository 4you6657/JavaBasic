package com.yangtze.File.FileMethods;

import java.io.File;
import java.io.IOException;

public class CreateAndDeleteFiles {
    public static void main(String[] args) throws IOException {
        /*
            创建、删除文件
         */

        // 1、public boolean createNewFile():    创建一个新文件（文件内容为空），创建成功返回true。
        File f1 = new File("E:\\JAVA_FILE\\yangtzeUniversityLogs.txt");
        boolean result = f1.createNewFile();
        System.out.println(result);
        // 2、public boolean mkdir():    用于创建文件夹（只能创建一级文件夹）
        File f2 = new File("E:\\JAVA_FILE\\First\\Second\\Third");
        boolean res = f2.mkdir();
        System.out.println(res); // false
        // 3、public boolean mkdirs():   用于创建文件夹（可以创建多级文件夹）
        boolean re = f2.mkdirs();
        System.out.println(re);
        // 4、public boolean delete():   删除文件和空的文件夹，不可以删除非空的文件夹
        // delete方法默认只能删除文件和空的文件夹，删除后的文件不会进入回收站
        boolean deleteRes = f1.delete();
        System.out.println(deleteRes);
        boolean delF2Res = f2.delete();
        System.out.println(delF2Res);

    }
}
