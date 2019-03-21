package Demo01;

import java.util.*;

public class Demo03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("itheima");
        list.add("it");
        list.add("hiema");
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).contains("it")) {
                list.remove(i);
            }
        }

        System.out.println("=========================");


            HashMap<String, String> hashMap = new HashMap<String, String>();
            hashMap.put("a", "aa");
            hashMap.put("a", "aa");
            hashMap.put("a", "dd");
            System.out.println(hashMap);

        Collection<String> arr=new ArrayList<String>();
        arr.add("鼓楼大街");
        arr.add("公主坟");
        arr.add("什刹海");
        arr.add("育新");
        Iterator<String> it=arr.iterator();
        it.next();
        while(it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }

        System.out.println("==========================");
        StringBuilder sb = new StringBuilder("I").append("love").append("java").append("very much");
        String s = sb.toString();
        System.out.println(s);

        System.out.println("=====================");

        Set <String> set = new HashSet<String>();
        set.add("set");
        set. add(new String("set"));
        System.out.println(set);

    }
}
