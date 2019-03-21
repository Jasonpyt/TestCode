package day09.day09_homework;

import com.sun.org.apache.bcel.internal.generic.GETFIELD;

import java.io.File;
import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个文件夹路径：");
        String s = scanner.nextLine();
        File file = new File(s);
        long length = getLength(file);
        System.out.println("文件夹大小是:"+length + "byte");

    }

        public static  long getLength(File file){
           long Length = 0;
            File[] files = file.listFiles();
            for (File file1 : files) {
                if (file1.isFile()){
                    Length += file1.length();
                }else {
                    Length += getLength(file);
                }
            }
            return  Length;
            }
        }
















