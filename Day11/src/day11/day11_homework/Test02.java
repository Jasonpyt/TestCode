package day11.day11_homework;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 描述:利用高效字节输出流往C盘下的e.txt文件写出一个字节数组数据，如写出：”i love java”
* */
public class Test02 {
    public static void main(String[] args) throws IOException {
        //创建高效字节输出流的步骤
        //1.创建基本输出流并关联目标路径
        FileOutputStream fos = new FileOutputStream("E:\\就业班\\TestCode\\src\\day11\\day11_homework\\e.txt");

        //2.创建高效输出流将进本输出流引入其中
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //3.进行读写操作这里因为要写入"i love java"
       bos.write("i love java".getBytes());

        //关闭资源流
        bos.close();
    }
}
