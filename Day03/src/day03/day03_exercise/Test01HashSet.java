package day03.day03_exercise;

import java.util.HashSet;

public class Test01HashSet {
    public static void main(String[] args) {
        //创建Set集合
        HashSet<String> set = new HashSet<>();
        //添加元素
        set.add(new String("abc"));
        set.add("abc");
        set.add("bac");
        set.add("cba");
        //遍历
        for (String s : set) {
            System.out.println(s);
            //结果说明HashSet集合不能存储重复元素

        }
    }
}
