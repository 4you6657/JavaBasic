package com.yangtze.IOStream.FileByteIOStream.FileByteInputStream;

import java.io.*;

public class ReadOneByte {
    /*
        文件字节输入流（FileInputStream）
            作用：以内存为基准，可以把磁盘文件中的数据以字节的形式读入到内存中去。

            常用构造器
                - public FileInputStream(File file):    创建字节输入流管道与源文件接通
                - public FileInputStream(String pathname):  创建字节流输入流管道与源文件接通

            方法名称
                - public int read():    每次读取一个字节返回，如果发现没有数据可读会返回-1
                - public int read(byte[] buffer):   每次用一个字节数组去读取数据，返回字节数组读取了多少个字节，如果发现没有数据可读会返回-1
     */

    public static void main(String[] args) throws IOException {
        // new File创建文件字节输入流管道，与源文件接通。
        FileInputStream fisUsingFileObject = new FileInputStream(new File("File-IOStream\\src\\yangtzeUniversity.txt"));
        // 直接填路径创建文件字节输入流管道，与源文件接通。
        FileInputStream fisUsingPathName = new FileInputStream("File-IOStream\\src\\yangtzeUniversity.txt");
        // 用多态写
        InputStream is = new FileInputStream("File-IOStream\\src\\yangtze.txt");

        // int b1 = is.read();
        // System.out.println(b1);

        // int b2 = is.read();
        // System.out.println(b2);

        // int b3 = is.read();
        // System.out.println(b3);

        // 使用循环改造上述注释代码
        int b; // 用于记住读取的字节
        while (((b = is.read()) != -1)) {
            System.out.print((char) b);
        }
        System.out.println("");
        System.out.println("文件读完了~");

        // 上述方法的读取性能很差！
        // 读取汉字输出会乱码！且无法避免！
        // 流使用完毕之后必须关闭！释放系统资源！
        is.close();
        /*
            注意事项
                - 使用FileInputStream每次读取一个字节，读取性能较差，并且读取汉字输出会乱码。
         */





    }
}
