package day03.day03_homework;

import java.util.LinkedList;

public class Test05_LinkedList_Method {
    public static void main(String[] args) {
        /*
        * 五、根据要求练习LinkedList方法：
（1）基本方法：add, set, get, remove, clear, size等方法；
（2）特有方法：addFirst, addLast, getFirst, getLast, removeFirst,removeLast,
 push, pop, clear等方法。
        * */

        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(1);//1
        Integer integer1 = integers.get(0);
        System.out.println(integer1);//1
        integers.add(2);
        Integer integer = integers.removeLast();
        System.out.println(integer);//2
        integers.clear();
        System.out.println(integers);//[]
        int size = integers.size();
        System.out.println(size);//0
        integers.addFirst(100);
        System.out.println(integers);//[100]
        integers.addLast(200);
        System.out.println(integers);//[100,200]
        Integer first = integers.getFirst();
        System.out.println(first);//100
        Integer last = integers.getLast();
        System.out.println(last);//200
        Integer integer2 = integers.removeLast();
        System.out.println(integer2);//200
        Integer integer3 = integers.removeFirst();
        System.out.println(integer3);//100
        integers.push(100);
        System.out.println(integers);
        integers.push(500);
        System.out.println(integers);//相当于addFirst
        integers.push(70000);
        System.out.println(integers);//相当于addFirst
        Integer pop = integers.pop();
        System.out.println(pop);//70000相当于getFirst()
        integers.clear();//


    }
}
