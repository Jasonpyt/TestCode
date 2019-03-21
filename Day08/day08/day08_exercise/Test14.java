package day08.day08_exercise;

import java.util.stream.Stream;

/*
    Stream中 有一个 过滤的功能
      进过条件判断，将符合要求的数据放置到子集流中 （返回值的那个流中）

    Stream<T> filter(Predicate<? super T> predicate);

    用方法的时候  参数是 Predicate接口 要的结果是boolean类型
                 使用lambda去表达  表达的就是判断的含义
                 对流中每个元素进行判断  符合要求的留下存储到子集流中

    流一旦使用了 就不能回头了。
    流只能消费一次

 */
public class Test14 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("独秀同学", "代表们", "祖国的花朵", "张强");
        //进行筛选
        Stream<String> stream1 = stream.filter(s -> s.length() == 3);
        System.out.println(stream1.count());
    }
}
