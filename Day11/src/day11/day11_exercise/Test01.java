package day11.day11_exercise;

import java.io.*;
import java.util.stream.Stream;

public class Test01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\就业班\\TestCode\\src\\day11\\a.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        int len;
        while ((len = bis.read())!= -1){
            System.out.println((char) len);
        }

        BufferedReader br = new BufferedReader(new FileReader("E:\\就业班\\TestCode\\src\\day11\\a.txt"));
        String s = br.readLine();
        System.out.println(s);

    }
}
