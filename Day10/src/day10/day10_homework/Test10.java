package day10.day10_homework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) throws IOException {
        /*
        * 描述:
            从控制台循环接收用户录入的学生信息，输入格式为：学号-学生名字
            将学生信息保存到D盘下面的stu.txt文件中，一个学生信息占据一行数据。
            当用户输入end时停止输入。
        *
        * */


        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入学生信息，格式：学号-姓名");
            String input = sc.nextLine();
            if (input.equals("end")) {
                break;
            }
            FileOutputStream fos = new FileOutputStream("E:\\就业班\\TestCode\\src\\day10.day10_homework\\stu.txt", true);
            fos.write(input.getBytes());
            fos.write("\r\n".getBytes());
            // fos.write(System.lineSeparator().getBytes());


        }
    }
}
