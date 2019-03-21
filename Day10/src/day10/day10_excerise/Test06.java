package day10.day10_excerise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test06 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流并关联源文件
        FileInputStream fis = new FileInputStream("E:\\就业班\\TestCode\\src\\day10\\aa.txt");
        //执行读取操作
        //创建一个临时数组用来当每次读取字节的容器
        byte[] bys = new byte[2];
        //使用这个数组开始读取
        int read = fis.read(bys);
        //读取到的字节存放于数组中,解析出来
        System.out.println("本次读取到字节个数:" + read);

        for (int i = 0; i < read ; i++){
            System.out.println(bys[i]);
        }
    }
}
