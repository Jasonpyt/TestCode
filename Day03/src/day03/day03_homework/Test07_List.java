package day03.day03_homework;

import java.util.LinkedList;
import java.util.List;

/*
* 向list集合添加姓名{张三,李四,王五,二丫,钱六,孙七},将二丫替换为王小丫
* */
public class Test07_List {
    public static void main(String[] args) {
        //创建一个List集合
        List<String>list = new LinkedList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("二丫");
        list.add("钱六");
        list.add("孙七");
        list.set(3,"王小丫");
        System.out.println(list);

    }
}
