package day03.day03_exercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/*
* List集合的特点:
*   1.有序
*   2.有索引可以使用索引的方法
*   3.可以重复
*
*   最常用的两个实现类
*       1.ArrayList
*       2.LinkedList
*
* */
public class TestList {

    public static void main(String[] args) {
        //创建List对象,因为List是接口所以必须有相应的实现类
        List<String> list = new ArrayList<>();
            list.add("abc");
            list.add("abc");
            list.add("bcd");

            //通过增强for进行遍历
        for (String str : list){
            System.out.print(str + " ");//abc abc bcd
        }
        System.out.println();
        System.out.println("==========================");
        //通过迭代器进行遍历
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String next = it.next();
            System.out.print(next + " ");

        }
        System.out.println();
        System.out.println("==============================");
        //通过普通for进行遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.print( list.get(i) + " ");
        }
    }



}
