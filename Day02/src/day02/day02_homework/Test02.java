package day02.day02_homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test02 {
    public static void main(String[] args) {
      Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        int a = listTest(list, "bbz");
        System.out.println(a);

    }

    public static int listTest(Collection<String> list,String s){

        Iterator<String> iterator = list.iterator();
        int count = 0;
        while(iterator.hasNext()){
            String next = iterator.next();
            if (next .contains(s)){
                count++;
            }
        }

return count;

    }

}
