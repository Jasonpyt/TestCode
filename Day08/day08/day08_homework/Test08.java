package day08.day08_homework;

import java.util.ArrayList;

public class Test08 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("陈玄风");
        list.add("梅超风");
        list.add("陆乘风");
        list.add("曲灵风");
        list.add("武眠风");
        list.add("冯默风");
        list.add("罗玉风");
        list.stream().limit(2).forEach(System.out::println);
        System.out.println("==============================");
        list.stream().skip(5).forEach(System.out::println);
    }

}
