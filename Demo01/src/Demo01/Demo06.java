package Demo01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
* .传智博客包含2个班级:Java基础班,Java就业班
Java基础班:
001	李晨
	002	范冰冰
Java就业班:
	001	马云
	002	马化腾
使用HashMap嵌套HashMap方式完成：
	a.使用keySet和增强for遍历出里面的元素
	b.使用entrySet和迭代器遍历出里面的元素

* */
public class Demo06 {
    public static void main(String[] args) {
        HashMap<String, String> base = new HashMap<>();
        base.put("001","李晨");
        base.put("002","范冰冰");

        HashMap<String, String> jiuye = new HashMap<>();
        jiuye.put("001","马云");
        jiuye.put("002","马化腾");

       /* a.使用keySet和增强for遍历出里面的元素
        b.使用entrySet和迭代器遍历出里面的元素*/

        Set<String> set = base.keySet();
        for (String key : set) {
            String value = base.get(key);
            System.out.println(key + value);
        }
        System.out.println("==========================");
        Set<Map.Entry<String, String>> entries = jiuye.entrySet();
        Iterator<Map.Entry<String, String>> it = entries.iterator();
        while (it.hasNext()){
            Map.Entry<String, String> entry = it.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + value);
        }

    }
}
