package day08.day08_exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test18 {
    public static void main(String[] args) {
        List<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("老子");
        one.add("庄子");
        one.add("孙子");
        one.add("洪七公");



//        1. 第一个队伍只要名字为3个字的成员姓名；
//        2. 第一个队伍筛选之后只要前3个人；

        //先将第一支队伍的数组对象转换为stream流
        Stream<String> stream = one.stream();
        Stream<String> one1 = stream.filter(name -> name.length() == 3).limit(3);


        List<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("张三丰");
        two.add("赵丽颖");
        two.add("张二狗");
        two.add("张天爱");
        two.add("张三");
//        3. 第二个队伍只要姓张的成员姓名；
//        4. 第二个队伍筛选之后不要前2个人；
        Stream<String> two1 = two.stream().filter(name -> name.startsWith("张")).skip(2);
        System.out.println("========================================");

        //合并两只队伍
        Stream<String> concat = Stream.concat(one1, two1);

        System.out.println("==============================================");

concat.map(Person::new).forEach(System.out::println);

    }
}
