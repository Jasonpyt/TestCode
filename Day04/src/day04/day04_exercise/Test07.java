package day04.day04_exercise;

import java.util.Hashtable;

/*
    java.util.Hashtable<k,v>集合 implements Map<k,v>接口
    Hashtable集合是最早期的双列集合,在1.0版本时候就出现了

    Hashtable和HashMap的区别
        1.Hashtable是一个线程安全的集合,单线程集合,效率低
          HashMap是一个线程不安全的集合,多线程集合,效率高
        2.Hashtable不允许存储null类型的key与null类型的value
          HashMap允许存储null类型的key与null类型的value

    Hashtable集合被HashMap集合给取代了
    但是Hashtable的孩子Properties集合依然活跃在历史的舞台
 */
public class Test07 {
    public static void main(String[] args) {
        Hashtable<String, String>able = new Hashtable<>();
        able.put("张三","李四");
        able.put("null","null");
        able.put(null,null);
        System.out.println(able);//添加空元素就会出现java.lang.NullPointerException异常
    }
}
