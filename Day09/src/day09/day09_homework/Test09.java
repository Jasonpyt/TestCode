package day09.day09_homework;

import java.io.File;

public class Test09 {
    public static void main(String[] args) {
        File file = new File("D:\\EEE");
        if (file.isDirectory()){
            System.out.println(file.length() );
            String[] list = file.list();
            for (String s : list) {
                System.out.println(s);
            }

        }else{
            System.out.println(file.length());
        }
    }
}
