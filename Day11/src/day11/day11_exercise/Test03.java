package day11.day11_exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test03 {
    public static void main(String[] args) throws IOException {
        //创建高效流需要基本流
        BufferedReader br = new BufferedReader(new FileReader("E:\\就业班\\TestCode\\src\\day11\\a.txt"));
        String s = br.readLine();
        System.out.println(s);
    }
}
