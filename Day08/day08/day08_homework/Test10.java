package day08.day08_homework;

import java.util.stream.Stream;

public class Test10 {
    public static void main(String[] args) {
        String[] arr1 ={"郭靖","杨康"};
        Stream<String> arr11 = Stream.of(arr1);

        String[] arr2 = {"黄蓉","穆念慈"};
        Stream<String> arr21 = Stream.of(arr2);
        Stream.concat(arr11,arr21).forEach(System.out::println);
    }


}
