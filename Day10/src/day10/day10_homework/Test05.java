package day10.day10_homework;

import java.io.FileInputStream;
import java.io.IOException;

public class Test05 {
    public static void main(String[] args) throws IOException {
        /*
        * 描述:利用字节输入流读取D盘文件b.txt的内容，文件内容确定都为纯ASCII字符
            ,使用循环读取，一次读取一个字节数组，直到读取到文件末尾，将读取到的字节数组转换成字符串输出到控制台。
        *
        * */
        FileInputStream fis= new FileInputStream("D:\\b.txt");
        int len;
        byte[] buffer = new byte[1024];
        while((len = fis.read(buffer))!= -1){
            System.out.println(new String(buffer,0,len));
        }
    }
}
