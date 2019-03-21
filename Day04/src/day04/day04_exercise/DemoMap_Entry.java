package day04.day04_exercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemoMap_Entry {
    public static void main(String[] args) {
        HashMap<String, Integer> MAP = new HashMap<>();
        MAP.put("王五",18);
        MAP.put("赵六,",11);

        Set<Map.Entry<String, Integer>> set = MAP.entrySet();
        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<String, Integer> entry = it.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " " + value);
        }
        for (Map.Entry<String, Integer> entry : set) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+" "+ value);
        }
    }
}
