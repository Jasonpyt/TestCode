package day10.day10_excerise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test04 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流 并关联源文件
        FileInputStream fis = new FileInputStream("E:\\就业班\\TestCode\\src\\day10\\aa.txt");//因为指定位置没有该文件,则会爆出找不到文件异常
        // 执行读取操作
        int read = fis.read();
        System.out.println(read);
        //释放资源
        fis.close();


        //创建字节输入流 并关联源文件
        FileInputStream fis1 = new FileInputStream("E:\\就业班\\TestCode\\src\\day10\\a.txt");
        // 执行读取操作
        int byte1 = fis1.read();

        System.out.println((char)byte1);

        //释放资源
        fis.close();

    }
}
