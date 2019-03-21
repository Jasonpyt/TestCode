package day11.day11_homework;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.*;

//描述:
//        项目根路径下有text.txt文件，内容如下：
//        我爱黑马
//        123456
//        利用IO流的知识读取text.txt文件的内容反转后写入text1.txt文件中，内容如下：
//        123456
//        我爱黑马
public class Test09 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("E:\\就业班\\TestCode\\src\\day11\\day11_homework\\text.txt");
        BufferedReader br = new BufferedReader(fr);
        String s = br.readLine();
        String s1 = br.readLine();

        FileWriter fw = new FileWriter("E:\\就业班\\TestCode\\src\\day11\\day11_homework\\text01.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(s1);
        bw.newLine();
        bw.write(s);
        bw.close();

    }
}
