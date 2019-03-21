package day09.day09_homework;

import java.io.File;

public class Test06 {
    public static void main(String[] args) {
        File file = new File("D:\\b.txt");
        String name = file.getName();
        long length = file.length();
        String absolutePath = file.getAbsolutePath();
        String path = file.getParent();
        System.out.println("该文件的名字是:" + name + ",文件长度是:" + length +",文件的绝对路径是:" + absolutePath +
                "父路径是:" + path);
        System.out.println("======================================");
        File file1 = new File("D:\\aaa");
        String name1 = file1.getName();
        long length1 = file1.length();
        String absolutePath1 = file1.getAbsolutePath();
        String parent = file1.getParent();
        System.out.println("该文件夹名字是:" + name1 + ",文件夹大小是:" + length1 +",文件夹的绝对路径是:" + absolutePath1 +
                "文件夹父路径是:" + parent);


    }
}
