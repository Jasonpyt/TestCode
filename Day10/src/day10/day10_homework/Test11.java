package day10.day10_homework;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) throws IOException {
        /*
        * 需求说明：从控制台接收3名学员的信息，每条信息存储到一个Student对象中，将多个Student对象存储到一个集合中。
        * 输入完毕后，将所有学员信息存储到文件Student.txt中。每名学员信息存储一行，多个属性值中间用逗号隔开。
        *
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学员的信息(包括学员的姓名,年龄,性别)");
        System.out.println("请输入第一名学员写信息:");
        String s1 = sc.nextLine();
        System.out.println("请输入第二名学员信息:");
        String s2 = sc.nextLine();
        System.out.println("请输入第三名学员信息:");
        String s3 = sc.nextLine();



        FileWriter fr = new FileWriter("E:\\就业班\\TestCode\\src\\day10.day10_homework\\student.txt",true);
        fr.write(s1 + "\r\n");
        fr.write(s2 +"\r\n");
        fr.write(s3 + "\r\n");
        fr.close();


    }
}
