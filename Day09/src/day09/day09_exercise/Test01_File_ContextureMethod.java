package day09.day09_exercise;

import java.io.File;

/*
* - public File(String pathname) ：通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。
- public File(String parent, String child) ：从父路径名字符串和子路径名字符串创建新的 File实例。
- public File(File parent, String child) ：从父抽象路径名和子路径名字符串创建新的 File实例。


小贴士：

1. 一个File对象代表硬盘中实际存在的一个文件或者目录。
2. 无论该路径下是否存在文件或者目录，都不影响File对象的创建。

* */
public class Test01_File_ContextureMethod {
    public static void main(String[] args) {
        //使用public File(String pathname) ：通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。生成file对象
        File file1 = new File("day09\\aaa.txt");
        System.out.println(file1);//day09\aaa.txt
        System.out.println("====================================================");
        //通过父路径和自路径字符串创建file对象
        File file2 = new File("da09", "bbb.txt");
        System.out.println(file2);//da09\bbb.txt
        System.out.println("=====================================================");
        //通过父级File对象和自路径字符串创建file对象
        File file3 = new File(new File("day09"), "ccc.txt");
        System.out.println(file3);//day09\ccc.txt

    File  parentsFile = new File("E:\\就业班\\TestCode\\src\\day09");
    String child = "ddd.java";
        File file4 = new File(parentsFile, child);
        System.out.println(file4);//E:\就业班\TestCode\src\day09\ddd.java
        System.out.println("=========================================================");
    }
}
