package day09.day09_homework;

import java.io.File;

public class Test01 {
    public static void main(String[] args) {
        //使用绝对路径创建一个对象
        File file = new File("E:\\就业班\\TestCode\\src\\day09\\day09_homework\\aa.txt");
        System.out.println("使用绝对路径创建的文件是:"+ file);
        System.out.println("========================================================");
        File file1 = new File("day09\\day09_homework\\bb.txt");
        System.out.println("使用相对路径创建的文件是:" + file1);
    }
}
