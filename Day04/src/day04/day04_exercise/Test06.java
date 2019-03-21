package day04.day04_exercise;

import java.util.LinkedHashMap;

/*
    java.util.LinkedHashMap<k,v>集合 extends HashMap<k,v>集合 implements Map<k,v>接口
    Map 接口的哈希表和链接列表实现，具有可预知的迭代顺序。
    LinkedHashMap:是一个有序的集合
        哈希表:数组+单向链表
        单向链表:记录元素的顺序
 */
public class Test06 {
    public static void main(String[] args) {
        //创建LinkedHashMap对象
        LinkedHashMap<String, Integer> linked = new LinkedHashMap<>();
        linked.put("冯提莫",150);
        linked.put("赵丽颖",165);
        linked.put("迪丽热巴",170);
        System.out.println(linked);
    }
}
