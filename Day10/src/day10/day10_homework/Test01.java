package day10.day10_homework;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws IOException {
        //利用字节输出流一次写一个字节的方式，向D盘的a.txt文件输出字符‘a’。
        FileOutputStream fos = new FileOutputStream("D:\\a.txt");
        fos.write('a');
        fos.close();

    }
}
