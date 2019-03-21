package day09.day09_homework;

import java.io.File;
import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        //键盘录入一个文件夹路径
        System.out.println("请输入文件夹的路径:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        File file = new File(input);
          file.mkdir();
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()){
                boolean delete = file1.delete();
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
            }
        }

    }
        }



