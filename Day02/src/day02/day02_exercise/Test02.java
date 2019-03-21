package day02.day02_exercise;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/*
* 说出Collection集合的常用功能
*   Collection集合是所有单列集合的父接口,因此在Collection中定义了单列集合(List和Set)通用的一些方法,
*           List中含有:ArrayList和LinkedList两类
*           set中含有:HashSet和LinkedHashSet
*
*           ArrayList的特点
*               1.有序
*               2.有索引
*               3.可以存放重复的数据
*
*               LinkedList的特点
*                   1.可以存放重复的数据
*                   2.有序
*                   3.有索引
*
*                    HashSet的特点
*                       1.无序
*                       2.不可以存放重复的数据
*                       3.没有索引
*                     LinkedHashSet的特点:
*                           1.有序
*                           2.不可以存放重复的数据
*                           3.无索引
*
*  Collection的常用方法:
*       public static boolean add(E e);
*       public void clear()
*       public boolean isEmpty
*       public boolean contains();
*       public int size();
*       public Object[] obj toArray();
*       public boolean remove();
*
* */
public class Test02 {
    public static void main(String[] args) {
        //创建Collection集合
        Collection<Character> c = new LinkedList();
        //向Collection集合中添加元素
        c.add('a');
        c.add('b');
        c.add('c');

        //使用迭代器遍历数组
        Iterator<Character> iterator = c.iterator();

       while (iterator.hasNext()){
            char next = iterator.next();
            System.out.println(next);



        }

        for (Character character :c ) {
            System.out.println(character);
        }
    }
}
