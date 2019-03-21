package day07.day07_homework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class Test13 {
    public static <T> void doJob(T t, Consumer<T> consumer) {
        consumer.accept(t);
    }
    public static <T> void doJob(T t, Consumer<T> consumer1, Consumer<T> consumer2) {
        consumer1.andThen(consumer2).accept(t);
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        //key:姓名 value:成绩
        map.put("岑小村",59);
        map.put("谷天洛",82);
        map.put("渣渣辉",98);
        map.put("蓝小月",65);
        map.put("皮几万",70);

        doJob(map,(m) -> System.out.println("谷天洛" + m.get("谷天洛")) );
        //打印最高分
        doJob(map,(m) ->{
            Collection<Integer> values = m.values();
            Integer max = 0;
            for (Integer value : values) {
                if(value > max){
                    max = value;
                }
            }
            System.out.println("最高分:" + max);
        });

        //打印及格人的名字
        doJob(map,(m) -> {
            Set<Map.Entry<String, Integer>> entries = m.entrySet();
            for (Map.Entry<String, Integer> entry : entries) {
                if (entry.getValue() >=  60){
                    System.out.println("及格的人有:");
                    System.out.println(entry.getKey());
                }
            }
            });

        }



}
