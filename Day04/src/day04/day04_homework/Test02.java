package day04.day04_homework;

import java.util.*;

/*
* 五、请使用Map集合存储自定义数据类型Car做键，对应的价格做值。
* 并使用keySet和entrySet两种方式遍历Map集合。
* */
public class Test02 {
    public static void main(String[] args) {
        Car c1 = new Car("BWM",100000000);
        Car c2 = new Car("BC",200000000);
        Car c3 = new Car("DW",999999999);
        HashMap<String,Integer> map = new LinkedHashMap<>();
        map.put(c1.getBrands(),c1.getPrice());
        map.put(c2.getBrands(),c2.getPrice());
        map.put(c3.getBrands(),c3.getPrice());

        Set<String> set = map.keySet();
        for (String key : set) {
            Integer value = map.get(key);
            System.out.println(key + " " + value);
        }

        System.out.println("=====================");
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            Integer value = entry.getValue();
            String key = entry.getKey();
            System.out.println(key+value);
        }
        }
    }



