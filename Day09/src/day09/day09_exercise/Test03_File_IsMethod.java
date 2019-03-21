package day09.day09_exercise;

import java.io.File;

/*
* - public boolean exists() ：此File表示的文件或目录是否实际存在。
- public boolean isDirectory() ：此File表示的是否为目录。
- public boolean isFile() ：此File表示的是否为文件。

* */
public class Test03_File_IsMethod {
    public static void main(String[] args) {
        File file = new File("day09\\aaa.txt");
       //public boolean exists() ：此File表示的文件或目录是否实际存在
        boolean exists = file.exists();
        System.out.println("该文件是否实际存在:" + exists);//该文件是否实际存在:false
        File file1 = new File("E:\\就业班\\TestCode\\src\\day09\\bbb.txt");
        boolean exists1 = file1.exists();
        System.out.println("该文件是否实际存在" + exists1);//该文件是否实际存在true,必须给绝对路径否则可能出现找不到的现象
        System.out.println("===========================================================");
        boolean flag = file.isFile();
        System.out.println("该对象是否是一个文件" + flag);//false
        boolean directory = file.isDirectory();
        System.out.println("该对象是否是一个目录" + directory);
        boolean flage1 = file1.isFile();
        System.out.println("该对象是否是一个文件" + flage1);
        boolean directory1 = file1.isDirectory();
        System.out.println("该对象是否是一个目录:" + directory1);
    }
}
