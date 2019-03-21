package day10.day10_excerise;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.*;

public class Test01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("read.txt",true);
        byte[] by = {'a','b','c','A','B','C'};
        fileOutputStream.write(by);

        FileInputStream fileInputStream = new FileInputStream("read.txt");
        int read = fileInputStream.read(by);
        System.out.println(read);

    }
}
