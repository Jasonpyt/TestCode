package day08.day08_exercise;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

/*
根据Collection获取流
   Stream 是JDK8之后有的 是一个流的概念，就是流水线作业的意思

      获取流
        集合可以转换成流
        Collection有个默认功能 stream()  返回值就是一个流对象

        研究一下 将
        List集合 set集合 转换成 Stream流对象
 */
public class Test11 {
    public static void main(String[] args) {
    //创建一个Collection对象
        Collection<String> list = new ArrayList<>();
       list.add("东");
       list.add("西");
       list.add("南");
       list.add("北");

        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);
    }
}
