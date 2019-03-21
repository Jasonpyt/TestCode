package day02.day02_homework;

import java.util.ArrayList;

/*
* 八、定义一个方法listTest(ArrayList<Integer> al, Integer s)，要求返回s在al里面第一次出现的索引，如果s没出现过返回-1。
* */
public class Test07 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        int i = listTest(al, 1);
        System.out.println(i);
    }
    public static int listTest(ArrayList<Integer>al,Integer s){
        return al.indexOf(s);

    }
}
