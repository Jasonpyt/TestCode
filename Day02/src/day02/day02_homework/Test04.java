package day02.day02_homework;

import java.util.Collection;
import java.util.LinkedList;

public class Test04 {
    public static void main(String[] args) {
        //创建一个Collection集合
        Collection coll = new LinkedList();
        coll.add(1);
        coll.add(2);
        coll.add(3);
        coll.add(4);
        getArray(coll);
    }
    //定义一个方法讲一个集合转换为数组返回
    public static void getArray(Collection<?>coll){
        Object[] objects = coll.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.print(objects[i] + " ");
        }

    }
}
