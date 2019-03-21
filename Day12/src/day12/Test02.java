package day12;

import java.io.*;

/*
         有一个文件
            在 D:\335\读取.txt    GBK
            要求你 一行行的将数据读取，并解析成功。

            BufferedReader
           转换流  InputStreamReader
        */
public class Test02 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\就业班\\TestCode\\src\\day12\\读取.txt.txt"), "gbk");

        BufferedReader br = new BufferedReader(isr);

        String line;

       while ((line = br.readLine())!= null){

           System.out.println(line);



       }
    }
}
