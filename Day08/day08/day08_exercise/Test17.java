package day08.day08_exercise;

import java.util.stream.Stream;

/*

   map 映射  一一对应

      通过图解 可以发现 map做了转换的功能

      map方法中参数就是转换接口Function<T,R>

      <R> Stream<R> map(Function< T,  R> mapper);
          将原来Stream<T>流中  T类型的元素 全部转换为R类型的元素 R类型元素放到子集流Stream<R>。

          我们如何使用该方法:
              传递的是lambda表达式
              表达式中 完成类型的转换 将一个T类型数据 转换成一个R类型数据

 */
public class Test17 {
    public static void main(String[] args) {
        //通过map映射方法  将流中的元素 转换成 Integer类型
//        Stream<Integer> stream1 = stream
//                .map((String t) -> {return Integer.parseInt(t);});
        //简化格式
//        Stream<Integer> stream1 = stream
//                .map( t ->  Integer.parseInt(t));

        Stream<String> stringStream = Stream.of("123", "456", "789");
        stringStream.map(i -> Integer.parseInt(i)).forEach(System.out::println);

        /*
  如果希望跳过前几个元素，可以使用skip方法获取一个截取之后的新流：

    Stream<T> skip(long n);

    如果流的当前长度大于n，则跳过前n个；否则将会得到一个长度为0的空流。基本使用：

 */
        System.out.println("============================================");
        Stream<String> stringStream1 = Stream.of("123", "456", "789","012");

        //stringStream1.skip(3).forEach(System.out::println);
        stringStream1.skip(10).forEach(System.out::println);//空值

    }
}
