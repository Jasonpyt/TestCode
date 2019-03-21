package day04.day04_exercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
* /*
    Map集合遍历的第二种方式_通过键值对方式
    Map集合中的方法:
        Set<Map.Entry<K,V>> entrySet() 返回此映射中包含的映射关系的 Set 视图。
    实现步骤:
        1.使用Map集合中的方法entrySet,把Map集合中的所有Entry对象取出来,存储到一个Set集合中
        2.遍历Set集合,获取每一个Entry对象
        3.使用Entry对象中的方法,getKey获取key,getValue获取value
     注意:
        Entry对象:键与值映射关系,键值对对象,包含键与值

* */
public class Test03 {
    public static void main(String[] args) {
        //创建Map集合对象
        Map<String,String>map = new HashMap<>();
        //添加元素
        map.put("杨过","小龙女");
        map.put("冷锋","龙小云");
        map.put("王宝强","马蓉");
        //使用Map集合的方法entrySet,把Map集合中的所有Entry对象取出来
        Set<Map.Entry<String, String>> set = map.entrySet();

        //2.遍历Set集合,获取每一个Entry对象
        //使用迭代器遍历
        Iterator<Map.Entry<String, String>> it= set.iterator();
        while(it.hasNext()) {
            //3.使用Entry对象中的方法,getKey获取key,getValue获取value
            Map.Entry<String, String> entry = it.next();
            //3.使用Entry对象中的方法,getKey获取key,getValue方法,获取value
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);

            //使用增强for行遍历
            for (Map.Entry<String, String> entrys : set) {
                String key1 = entrys.getKey();
                String value1 = entry.getValue();
                System.out.println(key1 + value1);


            }
        }
    }
}
