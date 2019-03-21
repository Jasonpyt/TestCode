package day04.day04_homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test01 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("张三",38);
        hm.put("李四",48);
        hm.put("王五",58);

        Set<String> set = hm.keySet();
        for (String key: set) {
            Integer value = hm.get(key);
            System.out.println(value);
        }
        System.out.println("----------------------");
        //迭代器
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String key = it.next();
            Integer value = hm.get(key);
            System.out.println(value);
        }
    }
}
