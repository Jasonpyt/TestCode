package day11.day11_homework;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
* 描述:现有一字符串：”我爱Java”。将该字符串保存到当前项目根目录下的a.txt文件中。
要求：使用gbk编码保存。
注意：idea的默认编码是utf-8,所以可以通过filesettingsfile encodings设置为gbk格式，否则打开a.txt文件看到的将会是乱码。
* */
public class Test05 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("E:\\就业班\\TestCode\\src\\day11\\day11_homework\\a.txt");
        int len ;
        while ((len = fr.read())!= -1){
            System.out.println((char) len);
        }
    }
}
