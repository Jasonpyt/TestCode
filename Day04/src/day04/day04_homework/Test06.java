package day04.day04_homework;

import java.util.*;

/*
* 八、定义一个泛型为String类型的List集合，统计该集合中
* 每个字符（注意，不是字符串）出现的次数。例如：集合中有”abc”、”
* bcd”两个元素，程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”。
* */
public class Test06 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("bce");
        HashMap<Character, Integer> hm = new HashMap<>();
        for (String s : list) {
            char[] chars = s.toCharArray();
            for (char aChar : chars) {
                Integer integer = hm.get(aChar);
                if (integer == null){
                    hm.put(aChar,1);
                }else{
                    hm.put(aChar,integer+1);
                }
            }
        }
        System.out.println(hm);


    }


    }


