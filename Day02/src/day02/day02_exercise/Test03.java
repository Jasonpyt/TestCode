package day02.day02_exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test03 {
    public static void main(String[] args) {
        Collection<Integer> coll = new ArrayList<>();
        coll.add(10);
        coll.add(20);
        coll.add(30);
        System.out.println(coll);

        //利用迭代循环集合
        Iterator<Integer> it = coll.iterator();//创建迭代器
        while(it.hasNext()){
            Integer str = it.next();
            System.out.println(str);
        }

        //foreach       快捷键:list.for
        for (Integer in : coll){
            System.out.println(in);
        }



    }
}
