package day04.day04_exercise;
/*
* /*
    Map集合遍历的第一种方式_通过键找值的方式
    Map集合中的方法:
        Set<K> keySet()  返回此映射中包含的键的 Set 视图。

    实现步骤:
        1.使用Map集合中的方法keySet,把Map集合中所有key取出来,存储到一个Set集合中
        2.遍历Set集合,获取Map集合中的每一个键
        3.使用Map集合中的方法get(key),通过key获取value
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class Test02 {

    public static void main(String[] args) {

        //创建Map对象,key使用String,value使用Integer
        Map<String,Integer> map = new HashMap<>();
        map.put("柳岩",18);
        map.put("迪丽热巴",18);
        map.put("马尔扎哈",18);

        //使用Map集合中的方法keySet,把Map集合中所有的key取出来
        Set<String> set= map.keySet();
        //遍历Set集合,获取Map集合中的每一个键
        //使用迭代器遍历
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String key = it.next();
            //再根据key找对应的value值
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
            System.out.println("------------------------------");
            //使用增强for进行遍历
            for (String keys : set) {
                Integer values = map.get(keys);
                System.out.println(keys + "=" + values);
            }
        }
            }
}
