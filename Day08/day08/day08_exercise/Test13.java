package day08.day08_exercise;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/*
  根据map获取流

       单列集合可以直接转换成流

       map变成单列集合
           然后再转换成流
 */
public class Test13 {
    public static void main(String[] args) {
        HashMap<String, Integer> list = new HashMap<>();
        list.put("陈独秀",1949);
        list.put("李大钊",1950);
        list.put("张三丰",10000);
        //根据键值将集合转化为stream流
        Set<String> set = list.keySet();
        Collection<Integer> values = list.values();



        Stream<String> stream = set.stream();
        //打印输出流中的元素
        stream.forEach(System.out::println);
        System.out.println("=============================");

        //根据entryset将集合转换为流
        Set<Map.Entry<String, Integer>> set1 = list.entrySet();
        Stream<Map.Entry<String, Integer>> stream1 = set1.stream();
        System.out.println(stream1);//会输出一段地址证明stream流本质也是引用类型的数据
        stream1.forEach(System.out::println);
    }
}
