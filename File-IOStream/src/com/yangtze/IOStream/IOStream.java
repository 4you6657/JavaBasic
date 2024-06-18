package com.yangtze.IOStream;

public class IOStream {
    public static void main(String[] args) {
        /*
            读写数据IO流
                - I指的是Input, 称为输入流：负责把读据到内存中。
                - O指的是Output,称为输出流：负责写数据。
            应用场景
                - 读写数据
                - 文件拷贝
                - 通信
            怎么学？
                - IO流分类、体系
                    i)分类
                        + 按流的方向分为：输入流、输出流
                        + 按流中数据的最小单位分为：
                            * 字节流（一个一个的字节，适合操作所有类型的文件，比如：音频、视频、图片、文本文件的复制、转移等）
                            * 字符流（一个一个的字符，只适合操作纯文本文件，比如：读写txt文件、Java文件等）
                        + IO流总体来看有4大类
                            * 字节输入流：以内存为基准，来自磁盘文件/网络中的数据以字节的形式读入到内存中去的流
                            * 字节输入流：以内存为基准，把内存中的数据以字节写出到磁盘文件或者网络中去的流
                            * 字符输入流：以内存为基准，来自磁盘文件/网络中的数据以字符的形式读入到内存中去的流
                            * 字符输出流：以内存为基准，把内存中的数据以字符写出到磁盘文件或者网络中去的流
                    ii)体系
                        + Java.io包下
                            * IO流体系
                                - 字节流
                                    ！ 字节输入流 InputStream(抽象类 Abstract Class)
                                        * FileInputStream(文件字节输入流，实现类 Implement Class)
                                    ！ 字节输出流 OutputStream(抽象类 Abstract Class)
                                        * FileOutputStream(文件字节输出流，实现类 Implement Class)
                                - 字符流
                                    ！ 字符输入流 Reader(抽象类 Abstract Class)
                                        * FileReader(文件字符输入流，实现类 Implement Class)
                                    ！ 字符输出流 Writer(抽象类 Abstract Class)
                                        * FileWriter(文件字符输出流，实现类 Implement Class)
                - 每个IO流的作用、用法


         */
    }
}
