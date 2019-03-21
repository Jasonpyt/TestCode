package day11.day11_exercise;

import java.io.*;

/**
 * 缓冲流是对基本流功能的增强
 *      所以在创建缓冲流的时候先要创建对应的基本流
 *
 *      构造方法:
 *          pulbic BufferInputStream(InputStream in):创建一个新的缓冲输入流
 *          public BufferOutputeStream(OupuStream out):创建一个新的缓冲输出流
 * */
public class Test02 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        //1.创建基本的字节输入流
        FileInputStream fis = new FileInputStream("E:\\就业班\\TestCode\\src\\day11\\a.txt");
        //2.提高读取的速度,创建BufferInputStream
        BufferedInputStream bis = new BufferedInputStream(fis);
        //3.进行读取操作
        int len;
        while ((len = bis.read())!=-1){
            System.out.println((char) len);
        }
        bis.close();
        long end = System.currentTimeMillis();
        System.out.println("进行读取操作所用的时间:" + Math.abs(start-end));//0证明时间读取速度非常快

        System.out.println("==========================================================================");
        //创建基本的字节输出流
        FileOutputStream fos = new FileOutputStream("E:\\就业班\\TestCode\\src\\day11\\a.txt",true);
        //提高写入速度,使用高效流
        BufferedOutputStream bos = new BufferedOutputStream(fos);
       bos.write("bbb".getBytes());

        bos.close();

    }
}
