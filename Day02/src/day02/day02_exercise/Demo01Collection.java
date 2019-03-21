package day02.day02_exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/*
* - public boolean add(E e)：  把给定的对象添加到当前集合中 。
- public void clear() :清空集合中所有的元素。
- public boolean remove(E e): 把给定的对象在当前集合中删除。
- public boolean contains(Object obj): 判断当前集合中是否包含给定的对象。
- public boolean isEmpty(): 判断当前集合是否为空。
- public int size(): 返回集合中元素的个数。
- public Object[] toArray(): 把集合中的元素，存储到数组中

* */
public class Demo01Collection {
    public static void main(String[] args) {
        //把给定的对象添加到当前集合中
        Collection <String>coll = new ArrayList();
        coll.add("abc");
        coll.add("def");
        System.out.println(coll);

        //- public void clear() :清空集合中所有的元素。
        coll.clear();
        System.out.println(coll);

        coll.add("abcdefg");

        //public boolean remove(E e): 把给定的对象在当前集合中删除。
        coll.remove("abcdefg");
        System.out.println(coll);//删除的必须是一个完整的元素否则不能删除

    //public boolean contains(Object obj): 判断当前集合中是否包含给定的对象。
        boolean b = coll.contains("abcdefg");
        System.out.println(b);//因为前面对对象进行了删除操作所以对象中自然不包括元素所以返回false

        //public boolean isEmpty(): 判断当前集合是否为空。

        boolean t = coll.isEmpty();
        System.out.println(t);//ture因为当前对象中没有元素
       // public int size(): 返回集合中元素的个数。

        int size = coll.size();
        System.out.println(size);//0

        // public Object[] toArray(): 把集合中的元素，存储到数组中

        Object[] objects = coll.toArray();
        System.out.println(objects.toString());

        System.out.println("================================");
        Collection<String>co =new ArrayList<>();
        co.add("张三");
        co.add("李四");
        co.add("王五");
        co.add("赵六");
        //System.out.println(co);
        Iterator<String> it = co.iterator();
        while(it.hasNext()){//判断是否有迭代元素
            String next = it.next();//获取迭代出的元素
            System.out.println(next);
            System.out.println("=====================");
            System.out.println("利用foreach进行循环");
            for (String s:co){
                System.out.println(s);
            }
        }
    }

}
