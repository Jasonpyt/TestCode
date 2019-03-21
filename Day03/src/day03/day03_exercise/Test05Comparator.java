package day03.day03_exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test05Comparator {
    public static void main(String[] args) {
        //创建四个学生对象
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("rose",18));
        list.add(new Student("jack",19));
        list.add(new Student("mark",17));
        list.add(new Student("abc",21));
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();//以学生的年龄升序
            }
        });

        for (Student student : list) {
            System.out.println(student);
        }
    }
}
