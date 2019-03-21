package day03.day03_exercise;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test03LinkedHashSet {
    public static void main(String[] args) {
       Set<String> strings = new LinkedHashSet<String>();
       strings.add("bbb");
       strings.add("bbb");
       strings.add("aaa");
       strings.add("bbb");

        for (String s : strings) {
            System.out.println(s);
        }
        System.out.println("============================");
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
