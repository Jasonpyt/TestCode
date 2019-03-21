package day02.day02_homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test05 {
    public static void main(String[] args) {
        //定义一个方法listTest(ArrayList<String> al, String s),要求使用contains()方法判断al集合里面是否包含s。
        Collection coll = new ArrayList<>();
        coll.add("a");
        coll.add("s");
        coll.add("b");
        coll.add("d");
        boolean s = listTest(coll, "s");
        System.out.println(s);

    }

    public static boolean listTest(Collection<?>list,String s){
        Iterator<?> iterator = list.iterator();
        return list.contains(s);

    }

}
