package day11.day11_homework;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段字符串:");
        String str = sc.nextLine();
        FileOutputStream fos = new FileOutputStream("E:\\就业班\\TestCode\\src\\day11\\day11_homework\\d.txt");
        fos.write(str.getBytes());
        PrintStream ps = new PrintStream("fos");


    }
}
