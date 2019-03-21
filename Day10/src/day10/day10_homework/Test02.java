package day10.day10_homework;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) throws IOException {
        //利用字节输出流一次写一个字节数组的方式向D盘的b.txt文件输出内容:"i love java"。
        FileOutputStream fis = new FileOutputStream("D:\\b.txt");
        byte[] buffer = {'i','l','o','v','e','j','a','v','a'};
        fis.write(buffer);

    }
}
