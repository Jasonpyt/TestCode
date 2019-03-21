package day08.day08_exercise;

import java.util.stream.Stream;

/*
   Stream流中的功能介绍
      forEach功能：
          帮助我们 逐一消费流中的数据

          void forEach(Consumer<? super T> action);

          将来 参数写lambda表达式，写如何消费数据。
 */
public class Test15 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("抚养人", "大还丹", "伞兵卢本伟", "打瞌睡");
        //对数据进行遍历使用forEach方法
        stream.forEach(System.out::println);
    }
}
