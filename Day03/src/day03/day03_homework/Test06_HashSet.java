package day03.day03_homework;

import java.util.HashSet;

/*
* 定义人类，包含姓名和年龄属性。创建4个人存储到HashSet中，
* 姓名和年龄相同的人看做同一人不存储。
* */
public class Test06_HashSet {
    public static void main(String[] args) {
        Person p1 = new Person("张三",18);
        Person p2 = new Person("张三",18);
        Person p3 = new Person("李四",18);

        //创建HashSet集合
        HashSet<Person> people = new HashSet<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        System.out.println(people);//[Person{name='张三', age=18}, Person{name='李四', age=18}]
    }
}
