package day08.day08_homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Stream;

public class Test09 {
    public static void main(String[] args) {
        Stream.of(1,-2,-3,4,-5).map(Math::abs).forEach(System.out::println);

    }
}
