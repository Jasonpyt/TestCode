package day08.day08_exercise;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test19 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("10", "20", "30", "40", "50");
        Set<String> collect = stream.collect(Collectors.toSet());
        Object[] objects = stream.toArray();
    }
}
