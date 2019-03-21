package Demo02;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test21 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("HelloJava", "java编程思想", "IOS开发快速入门", "java入门", "java宝典", "如何学好java");
        Stream<String> stream1 =
                stream.filter(s -> s.contains("java")).skip(1);
        System.out.println(stream1.count());

        Stream<String> stream2 = Stream.of("hello","world","tom");
       // String[] strArray = stream.toArray(String[]::new);
//         String[] strArray = stream.toArray(Object[]::new);
//         String[] strArray = stream.collect(Collectors.toSet());
//         String[] strArray = stream.collect(Collectors.toList()).toArray();
         //String[] strArray = stream.collect(Collectors.toList()).toArray(new String[3]);

    }
    }

