package day04.day04_exercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemoMap_KeySet {
    public static void main(String[] args) {
        Map<String,Integer>map = new HashMap<>();
        map.put("张三",23);
        map.put("李四",24);

        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String key = it.next();
            Integer value = map.get(key);
            System.out.println(key + " " + value );
        }

       for (String key : map.keySet()){
           Integer va = map.get(key);
           System.out.println(key + " " +va);
       }
    }
}
