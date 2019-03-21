package day11.day11_homework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
* 描述:
定义一个学生类，成员变量有姓名，年龄，性别，提供setters和getters方法以及构造方法
定义一个测试类，在测试类创建多个学生对象保存到集合中，然后将集合存储到当前项目根目录下的stus.txt文件中。
* */
public class Test10 {
    public static void main(String[] args) throws IOException {
        Student s1 = new Student("The Shey", 18, "男");
        Student s2 = new Student("JackLove", 20, "男");
        Student s3 = new Student("Ning", 21, "男");

        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        BufferedWriter bf = new BufferedWriter(new FileWriter("E:\\就业班\\TestCode\\src\\day11\\day11_homework\\stus.txt"));
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            bf.write(String.valueOf(student));
            bf.newLine();
        }
        bf.close();

    }
}
