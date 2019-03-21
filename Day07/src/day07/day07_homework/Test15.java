package day07.day07_homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Test15 {
    public static void main(String[] args) {
        //1.   使用lambda表达式分别将以下功能封装到Function对象中
        //a)   求Integer类型ArrayList中所有元素的平均数
        Function<ArrayList<Integer>,Integer> f1 = (list)->{
            Integer sum = 0;
            for (Integer i : list) {
                sum+=i;
            }
            return sum/list.size();
        };

        //b)   将Map<String,Integer>中value存到ArrayList<Integer>中
        Function<Map<String,Integer>,ArrayList<Integer>> f2 = (map)->{
            /*ArrayList<Integer> list = new ArrayList<>();
            for (String s : map.keySet()) {
                Integer i = map.get(s);
                list.add(i);
            }*/
            Collection<Integer> values = map.values();
            ArrayList<Integer> list = new ArrayList<>();
            list.addAll(values);
            return list;
        };

        //2 将学生姓名和成绩封装到map中
        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("岑小村", 59);
        map.put("谷天洛", 82);
        map.put("渣渣辉", 98);
        map.put("蓝小月", 65);
        map.put("皮几万", 70);

        //利用Function求平均成绩
        Integer avg = f2.andThen(f1).apply(map);
        System.out.println("学生平均成绩为："+avg);
    }
    }

