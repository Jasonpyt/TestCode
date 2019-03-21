package day08.day08_homework;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test07 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("黄药师");
        list.add("冯蘅");
        list.add("郭靖");
        list.add("黄蓉");
        list.add("郭芙");
        list.add("郭襄");
        list.add("郭破虏");
    //将数组转换为流
        Stream<String> stream = list.stream();
   stream.filter(name -> name.startsWith("郭")).forEach(System.out::println);

    }
}
