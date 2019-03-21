package day09.day09_homework;

import java.io.File;

public class Test07 {

    public static void main(String[] args) {
        File file = new File("D:\\aaa");
        if (file.isDirectory()){
            System.out.println(file.getName() + "是一个文件夹");
        }else{
            System.out.println(file.getName() +"不是一个文件夹");
        }
    }
}
