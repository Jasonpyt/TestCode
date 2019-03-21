package day03.day03_exercise;

import java.util.HashSet;

public class Test02HashSet {
    public static void main(String[] args) {
        //HashSet存储自定义类型元素
        //创建集合对象
        HashSet<Student> students = new HashSet<>();
        //存储
        Student stu = new Student("于谦",43);
        students.add(stu);
        Student stu1 = new Student("郭德纲",44);
        students.add(stu1);
        Student stu2 = new Student("郭麒麟",23);
        students.add(stu2);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
