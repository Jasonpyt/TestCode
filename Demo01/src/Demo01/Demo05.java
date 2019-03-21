package Demo01;

import java.util.ArrayList;
import java.util.Iterator;

/*
* 创建5个人对象放到ArrayList中，使用迭代器获取每个人对象，将每个人的年龄加2岁，再使用增强for打印每个人的信息。
* */
public class Demo05 {
    public static void main(String[] args) {
        //创建5个对象
        Person p1 = new Person("赵丽颖",18,1.60);
        Person p2 = new Person("迪丽热巴",17,1.65);
        Person p3 = new Person("杨幂",19,1.66);
        Person p4 = new Person("冯提莫",15,1.50);
        Person p5 = new Person("杨颖",20,1.66);
        //放到ArrayList集合中
        //创建ArrayList结合
        ArrayList<Person> list = new ArrayList<>();
//        把对象放到集合中
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);

        //使用迭代器获取每个对象,将每个人的年龄加2岁
        Iterator<Person> it = list.iterator();
        while (it.hasNext()){
            Person o = it.next();
            int age = o.getAge();
            o.setAge(age+2);

        }
        for (Person person : list) {
            System.out.println(person);
        }
    }
}

