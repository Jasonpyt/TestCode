package day09.day09_homework;

import java.io.File;

public class Test08 {
    public static void main(String[] args) {
        File file = new File("D:\\EEE");
        file.mkdir();
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
    }
    }

