package com.yangtze.File.FileStorage;

import java.io.File;

public class Test {
    /*
        存储数据的方案（变量、数组、对象、集合）
            -   它们都是内存中的数据容器。
            -   它们记住的数据，在断电、或者程序终止时会丢失。
        有些数据想要长久保存起来，怎么做？
            - 文件
                + 非常重要的存储方式，在计算机硬盘中。
                + 即便断电，或者程序终止了，存储在硬盘文件中的数据也不会丢失。
            - File
                + File是java.io.包下的类，File类的对象，用于代表当前操作系统的文件（可以是文件、文件夹）
                    * 获取文件信息(大小、文件名、修改时间)
                    * 判断文件类型
                    * 创建文件、文件夹
                    * 删除文件、文件夹
                    * ...
                + File类只能对文件本身进行操作，不能读写文件里面存储的数据。
            - 如何读写文件中存储的数据呢？--> IO流
                + 用于读写数据（可以读写文件，或网络中的数据）
     */

    public static void main(String[] args) {
        /*
            创建File类的对象
                -   public File(String pathname)    :   根据文件路径创建文件对象
                -   public File(String parent, String child)    :   根据父路径和子路径名创建文件对象
                -   public File(File parent, String child)  :   根据父路径对应文件对象和子路径名创建文件对象
         */

        // 1、创建一个File对象，指代某个具体文件。
        // 路径分隔符
        // File file = new File("E:\\JAVA_FILE\\TEST.txt");
        File file = new File("E:" + File.separator + "JAVA_FILE" + File.separator + "TEST.txt");
        System.out.println(file.length()); // 文件大小
        System.out.println(file.exists());

        File fileFolder = new File("E:" + File.separator + "JAVA_FILE");
        System.out.println(fileFolder.length()); // 文件夹大小
        System.out.println(fileFolder.exists());

        // File对象可以指代一个不存在的文件路径
        File fileNotExist = new File("E:" + File.separator + "JAVA_FILE" + File.separator + "FileNotExist.txt");
        System.out.println(fileNotExist.length());
        System.out.println(fileNotExist.exists());

        // 现在定位的文件是在模块中，应该怎么定位呢？
        File fileWithAbsolutePath = new File("D:\\IdeaProjects\\Basic\\JavaBasic\\File-IOStream\\src\\yangtze.txt"); // 绝对路径（不太好）
        // 建议使用相对路径（不带盘符，默认是直接去工程下寻找路径）
        File fileFromRootPath = new File("File-IOStream\\src\\yangtze.txt");
        System.out.println(fileFromRootPath.length());
        System.out.println(fileFromRootPath.exists());

    }
}
