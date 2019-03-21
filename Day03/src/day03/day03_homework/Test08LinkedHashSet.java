package day03.day03_homework;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*
* 八、使用LinkedHashSet存储以下元素："王昭君","王昭君","西施","杨玉环",
* "貂蝉"。使用迭代器和增强for循环遍历LinkedHashSet。
* */
public class Test08LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> list= new LinkedHashSet<>();
        list.add("王昭君");
        list.add("王昭君");
        list.add("西施");
        list.add("杨玉环");
        list.add("貂蝉");



        //使用迭代器进行遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }
    }
}
