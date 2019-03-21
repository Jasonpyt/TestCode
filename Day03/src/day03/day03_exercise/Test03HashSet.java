package day03.day03_exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

/*
* 使用HashSet集合存储自定义元素
	要求:保证同名同年龄的人是同一个人,自定义类型必须重写hashCode和equals方法
* */
public class Test03HashSet {

    public static void main(String[] args) {
        Person p1 = new Person("欧阳锋",19);
        Person p2 = new Person("洪七公",20);
        Person p3 = new Person("黄老邪",15);

        //遍历数组
        HashSet<Person> per = new HashSet<>();
        per.add(p1);
        per.add(p2);
        per.add(p3);
        for (Person person : per) {
            System.out.println(person);
        }

        //对集合进行性排序,按照降序排序
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("颜如玉",18));
        people.add(new Person("黄金屋",20));
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getAge()-o1.getAge();
            }
        });



    }
}
