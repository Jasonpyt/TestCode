package day11.day11_homework;

import sun.nio.cs.ext.GBK;

import java.io.*;

/*
* 描述:定义一个学生类，包含姓名，年龄，性别等成员变量，提供setters和getters方法以及构造方法。
* 在测试类中创建一个学生对象，给学生对象的三个成员变量赋值。然后将该对象保存到当前项目根目录下的stu.txt文件中。
* */
public class Test07 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student("张三", 23, "男");
       FileOutputStream fos = new FileOutputStream("E:\\就业班\\TestCode\\src\\day11\\day11_homework\\stu.txt");
        ObjectOutputStream out = new ObjectOutputStream(fos);
        out.writeObject(student);
        out.close();
    FileInputStream fis = new FileInputStream("E:\\就业班\\TestCode\\src\\day11\\day11_homework\\stu.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object o = ois.readObject();
        System.out.println(o);
        ois.close();

        }
    }
