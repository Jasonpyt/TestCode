package day10.day10_homework;

import java.io.FileInputStream;
import java.io.IOException;

public class Test09 {
    public static void main(String[] args) throws IOException {
        FileInputStream fos = new FileInputStream("E:\\就业班\\TestCode\\src\\day10.day10_homework\\test.txt");
        int a = getCount(fos, 'a');
        System.out.println(a);
    }

    public static  int getCount(FileInputStream fos,char c) throws IOException {
        int counta = 0;

        int len;
        while ( ( len =fos.read())  != -1){
            if (len == c){
                counta++;
            }else{

            }
        }
        return counta;
    }
}
