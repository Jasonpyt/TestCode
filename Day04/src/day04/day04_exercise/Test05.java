package day04.day04_exercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test05 {
    public static void main(String[] args) {
     //Entry方法的使用
        HashMap<String, String> map = new HashMap<>();
        map.put("杨过","小龙女");
        map.put("冷锋","龙小云");
        map.put("王宝强","马蓉");
        //使用Entry方法
        Set<Map.Entry<String, String>> set = map.entrySet();
        for (Map.Entry<String, String> entry : set) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + value);
        }

        //使用Entry对象中的方法,getKey获取key,value;
        Iterator<Map.Entry<String, String>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<String,String>entry = it.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+value);
        }
    }
}
