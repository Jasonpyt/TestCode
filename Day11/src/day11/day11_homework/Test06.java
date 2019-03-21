package day11.day11_homework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 描述:利用转换输入流将当前项目根目录下使用gbk编码的a.txt文件的内容读取出来，并打印在控制台上。
 * 要求：不能出现乱码的情况。
 * */
public class Test06 {
    public static void main(String[] args) throws IOException {

            FileReader fr = new FileReader("E:\\就业班\\TestCode\\src\\day11\\day11_homework\\a.txt");
            int len ;
            while ((len = fr.read())!= -1){
                System.out.print((char) len);

        }
    }
}
