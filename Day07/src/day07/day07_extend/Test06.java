package day07.day07_extend;

import java.util.function.Function;

public class Test06 {
    public static void main(String[] args) {
        String str = "赵丽颖,20";
        int age = getString(s -> s.split(",")[1], Integer::parseInt, n -> n += 10, str);
        System.out.println(age);

    }
    public static int getString(Function<String,String>one,Function<String,Integer>two,Function<Integer,Integer>three,String s){
        return one.andThen(two).andThen(three).apply(s);
    }

}
