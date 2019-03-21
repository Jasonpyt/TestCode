package day01.day01_homework;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Person p = new Person("张三",18);
        String string = p.toString();
        System.out.println(string);

        System.out.println("========================");
        System.out.println("查看Scanner类和Random类以及ArrayList是否重写了toString方法");
        System.out.println(new Scanner(System.in).toString());//不是地址值说明重写了toString方法
        System.out.println(new Random().toString());//是地址值证明没有重写toString方法
        System.out.println(new ArrayList<String>().toString());//不是地址值,证明重写了toString方法
    }
}
