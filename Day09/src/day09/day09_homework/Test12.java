package day09.day09_homework;

import java.io.File;

public class Test12 {
    public static void main(String[] args) {
        File file = new File("D:\\EEE");

        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()){
                if (file1.getName().endsWith("java")){
                    System.out.println(file1.getName());
                }
            }
        }


    }
}
