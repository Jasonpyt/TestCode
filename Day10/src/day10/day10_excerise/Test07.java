package day10.day10_excerise;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test07 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("E:\\就业班\\TestCode\\src\\day10\\a.txt");
        byte[] buffer = {'a','b','c','d'};

        int len;
        while ((len = fileInputStream.read(buffer)) != -1){
            System.out.println(new java.lang.String(buffer,0,len));
        }
    }
}
