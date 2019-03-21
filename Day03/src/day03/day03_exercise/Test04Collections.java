package day03.day03_exercise;

import java.util.ArrayList;
import java.util.Collections;

public class Test04Collections {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(300);
        list.add(200);
        list.add(50);
        //乱序排序方法
        Collections.shuffle(list);
        System.out.println(list);
        //排序
        Collections.sort(list);
        System.out.println(list);//升序排序
    }
}
