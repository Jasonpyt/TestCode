package day12;

import java.io.*;

public class Test01 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\就业班\\TestCode\\src\\day12\\out.txt"));

        FileWriter fw = new FileWriter("E:\\就业班\\TestCode\\src\\day12\\out.txt");

        /*
          public FileWriter(String fileName) throws IOException {
             super(new FileOutputStream(fileName));
          }
         */

    }
}
