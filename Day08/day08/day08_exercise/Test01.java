package day08.day08_exercise;

import java.util.function.Supplier;

public class Test01 {
    public static void main(String[] args) {
        String str = "java";
        getUper(()->{return str.toUpperCase();});
        getUper(str::toLowerCase);
    }

    public static  void getUper(Supplier<String>supplier){
        String s = supplier.get();
        System.out.println(s);
    }
}
