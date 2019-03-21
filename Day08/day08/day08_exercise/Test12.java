package day08.day08_exercise;
/*
* /*
   2  to
   4  for
   数组转换成 流？

     Stream有个静态方法of
 */

import java.util.ArrayList;
import java.util.stream.Stream;
public class Test12 {
    public static void main(String[] args) {
        //创建数组对象
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(6);
        Stream<ArrayList<Integer>> list1 = Stream.of(list);
        list1.forEach(System.out::println);
    }
}
