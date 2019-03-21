package day10.day10_excerise;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test08 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\就业班\\TestCode\\src\\day10\\a.txt");
        byte[] buffer = {'a','b','c'};
        int len;
        while ((len = fis.read(buffer))!= -1){
            System.out.println(new java.lang.String(buffer,0,len));
        }
        fis.close();
    }
}
