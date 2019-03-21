package day11.day11_homework;

import java.io.*;

/*
* 描述:利用高效字节输入流和高效字节输出流完成文件的复制。
要求：
1.将C盘下的c.png文件复制到D盘下
2.一次读写一个字节数组方式复制
*
* */
public class Test03 {
    public static void main(String[] args) throws IOException {
        //要完成文件的复制的操作就需要先对文件进行读操作,然后再进行写操作
        //1.创建高效字节输入流并利用匿名对象将字节基础输入流对象引入其中
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\就业班\\TestCode\\src\\day11\\day11_homework\\d.txt"));

        //2.创建高效字节出流对象利用匿名对象将字节基础输出流对象引入其中
        FileOutputStream fos = new FileOutputStream("E:\\就业班\\TestCode\\src\\day11\\day11_homework\\f.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //3.利用循环操作进行文件的读取操作,因为这里复制的是一张图片所以最好利用数组输入流进行操作
        int len;
        byte[] bytes = new byte[1024];
        while ((bis.read(bytes))!= -1){
            bos.write(bytes);

        }
        //4.关闭高效字节输出流和高效字节输入流
        bos.close();
        bis.close();
    }
}
