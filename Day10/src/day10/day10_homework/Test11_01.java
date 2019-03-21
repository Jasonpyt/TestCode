package day10.day10_homework;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/*
* 需求说明：从控制台接收3名学员的信息，每条信息存储到一个Student对象中，将多个Student对象存储到一个集合中。
* 输入完毕后，将所有学员信息存储到文件Student.txt中。每名学员信息存储一行，多个属性值中间用逗号隔开。


操作步骤:
1.创建Student类，有如下属性：
学号、姓名、性别、年龄
全部属性使用String类型。要求有无参，全参构造方法。所有属性私有，并提供公有get/set方法。
2.创建MainApp类，包含main()方法
3.在main()方法中：
1)定义一个存储Student对象的集合；
2)循环3次，从控制台接收3名学员信息，每条信息封装一个Student对象，将每个Student对象存储到集合中。
3)遍历集合，获取每个Student对象，取出所有属性值，输出到文件Test2_2.txt中。每名学员信息占一行。
* */
public class Test11_01 {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 3; i++) {
            System.out.println("请输入第" + i +"名学生的学号:");
            String id = sc.nextLine();
            System.out.println("请输入第" + i +"名学生的姓名:");
            String name = sc.nextLine();
            System.out.println("请输入第" + i + "名学生的性别:");
            String gender = sc.nextLine();
            System.out.println("请输入第" + i + "名学生的年龄:");
            String age = sc.nextLine();
            Student st = new Student(id,name,gender,age);
            list.add(st);

            FileWriter fw = new FileWriter("Student.txt");

            for (int j = 0; j < list.size();j++){
                Student s = list.get(j);

                String line = s.getId() + "," + s.getName() + "," + s.getGender() + "," + s.getAge();


                fw.write(line);
                fw.write(System.lineSeparator());
            }
            fw.close();// 关闭流
            }
        }
    }

