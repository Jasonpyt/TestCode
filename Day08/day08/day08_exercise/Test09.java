package day08.day08_exercise;

import java.util.ArrayList;
import java.util.List;

public class Test09 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        //第一层过滤找出姓张的人
        ArrayList<String> list1 = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张")){
                list1.add(s);
            }

        }

        //保留只有三个字的姓张的的人的名字
        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list1) {
            if (s.length() == 3){
                list2.add(s);
            }
        }

        for (String s : list2) {
            System.out.println(s);
        }
    }
}
