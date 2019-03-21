package day08.day08_homework;

import day03.day03_exercise.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test12 {
    public static void main(String[] args) {
        List<String> one = new ArrayList<>();
        one.add("陈玄风");
        one.add("梅超风");
        one.add("陆乘风");
        one.add("曲灵风");
        one.add("武眠风");
        one.add("冯默风");
        one.add("罗玉风");
        List<String> two = new ArrayList<>();
        two.add("宋远桥");
        two.add("俞莲舟");
        two.add("俞岱岩");
        two.add("张松溪");
        two.add("张翠山");
        two.add("殷梨亭");
        two.add("莫声谷");

        Stream<String> stream1 = one.stream();
        Stream<String> stream3 = stream1.filter(name -> name.length() == 3).limit(6);
        System.out.println(stream3);
        Stream<String> stream2 = two.stream();
        Stream<String> stream4 = stream2.filter(name -> name.startsWith("张")).skip(1);
        System.out.println("=============================");
        Stream<String> concat = Stream.concat(stream3, stream4);
        concat.map(Student::new).forEach(System.out::println);



    }

    }

