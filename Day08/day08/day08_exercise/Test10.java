package day08.day08_exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test10 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        //将数组转换为stream流
        Stream<String> stream = list.stream();
        stream.filter(name -> name.startsWith("张")).filter(s -> s.length() == 3).forEach(System.out::println);
    }
}
