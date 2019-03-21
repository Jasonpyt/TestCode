package day08.day08_exercise;

import java.util.stream.Stream;

/*
  limit方法可以对流进行截取，只取用前n个。方法签名：

    Stream<T> limit(long maxSize);

     参数是一个long型，如果集合当前长度大于参数则进行截取；否则不进行操作

 */
public class Test16 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("造纸术", "指南针", "印刷术", "火药");
         stream.limit(3).forEach(System.out::println);

    }
}
