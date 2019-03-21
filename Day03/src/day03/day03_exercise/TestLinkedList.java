package day03.day03_exercise;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.LinkedList;

/*
* java.util.LinkedList集合 implements List接口
*
* LinkedList集合特点:
*       底层是一个双向链表:查询慢,增删快,是一个有序的集合
*
*        LinkedList集合操作首尾元素很方便,包含了一些操作首尾元素的方法
        - public void addFirst(E e):将指定元素插入此列表的开头。
        - public void push(E e):将元素推入此列表所表示的堆栈。
        - public void addLast(E e):将指定元素添加到此列表的结尾。
        - public E getFirst():返回此列表的第一个元素。
        - public E getLast():返回此列表的最后一个元素。
        - public E removeFirst():移除并返回此列表的第一个元素。
        - public E removeLast():移除并返回此列表的最后一个元素。
        - public E pop():从此列表所表示的堆栈处弹出一个元素。
        - public boolean isEmpty()：如果列表不包含元素，则返回true。
    注意:
        使用子类特有的方法,不能使用多态
* */
public class TestLinkedList {
    public static void main(String[] args) {
    show1();
    }

    private static void show1() {
        /*
         - public E removeFirst():移除并返回此列表的第一个元素。
        - public E pop():从此列表所表示的堆栈处弹出一个元素。 此方法等效于 removeFirst()。
        - public E removeLast():移除并返回此列表的最后一个元素。
     */
        LinkedList <Integer>lin = new LinkedList();
        lin.add(1);
        lin.add(2);
        lin.add(3);
        lin.add(4);

        //- public E removeFirst():移除并返回此列表的第一个元素。
        Integer integer = lin.removeFirst();
        System.out.println("被删除的元素是:" + integer);
        System.out.println("删除后的元素集合为:" + lin);//[2, 3, 4]

        //String first = linked.removeFirst == linked.pop()

        //方法仅在队列为空时其行为有所不同：remove() 方法抛出一个异常，而 poll() 方法则返回 null
        Integer pop = lin.pop();
        System.out.println("被删除的元素是:" + pop);
        System.out.println("删除后的集合是:" + lin);

        //删除集合中最后一个元素String last = linked.removeLast
        Integer integer1 = lin.removeLast();
        System.out.println("删除的最后一个元素是:" + integer1);
        System.out.println("删除后的集合为:" + lin);
        //- public boolean isEmpty()：如果列表不包含元素，则返回true。
        boolean empty = lin.isEmpty();
        System.out.println(empty);//因为里面有元素所以为false


    }
}
