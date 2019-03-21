package day03.day03_exercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
* java.util.List接口 extends Collection 接口
* List接口的特点:
*       1.有序的集合(存储元素和取出元素的顺序一直)
*       2.有序索引,包含一些带索引的方法
*       3.允许存储重复元素
*
*List接口的方法:
*       1.public void add(int index, E element):将指定元素,添加到该集合中
*       2.public E get(int index):返回集合中指定位置的元素
*       3.public E remove(int index):移除列表中指定位置的元素,切记参数只能是索引值不能使具体的某个元素值
*       4.public E set(int index,E element):用指定元素替换集合中指定位置的元素
*
* 注意:
*       使用带索引的方法,必须防止索引越界异常
*           Index Out Of Bounds Exception:索引越界异常,一般集合会报
  *             StringIndexOutOfBoundsException:字符串索引越界异常
                ArrayIndexOutOfBoundsException:数组索引越界异常
     * */
public class Test01List {
    public static void main(String[] args) {
        //创建List集合对象
        ArrayList<String> list = new ArrayList<>();

        //往集合中添加元素
        list.add("a");
        list.add("b");
        list.add("a");
        list.add("c");           // 0  1  2  3
        System.out.println(list);//[a, b, a, c]

        System.out.println("=========================");

        // 1.public void add(int index, E element):将指定元素,添加到该集合中
        //想在索引2的位置添加一个元素
        list.add(2,"itCast");
        System.out.println(list);////[a, b, itCast, a, c]相当于覆盖了原2索引位置的元素,然后原来该位置的元素向后移动一位
        System.out.println("==========================");
        //public E get(int index):返回集合中指定位置的元素。
        //获取元素b
        String s = list.get(1);
        System.out.println(s);//b

        //public E remove(int index): 移除列表中指定位置的元素, 返回的是被移除的元素。
        //移除第二个a
        String remove = list.remove(3);
        System.out.println(remove);//被移除的元素:a
        System.out.println(list);////[a, b, itcast, c]
//public E set(int index, E element):用指定元素替换集合中指定位置的元素,返回被替换的元素。
        //设置指定位置的元素值
        String itHeima = list.set(2, "itHeima");
        System.out.println(itHeima);;//被替换的元素:itcast
        System.out.println(list);//[a, b, itHeima, c]
        System.out.println("=======================================");

        //遍历数组有三种方式:1.for循环,2.增强for3.迭代器
        //用第一种方法进行遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("===========================");

        //用第二种方法进行遍历
        for (String s1 : list) {
            System.out.println(s1);
        }
        System.out.println("==========================");

        //用第三种方法进行遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }

        //综合以上方法的出结论:使用增强for遍历最为方便快捷推荐使用
    }
}
