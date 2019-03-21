package day09.day09_homework;

import java.io.File;

public class Test05 {
    public static void main(String[] args) {
        //删除D盘下的a.txt文件
        File file = new File("D:\\a.txt");
        boolean delete = file.delete();
        System.out.println(delete);

        System.out.println("==========================");

        File file1 = new File("D:\\aaa");
        boolean delete1 = file1.delete();
        System.out.println(delete1);
    }
}
