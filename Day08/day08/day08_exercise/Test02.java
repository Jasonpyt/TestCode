package day08.day08_exercise;

import java.util.function.Consumer;

public class Test02 {
    public static void main(String[] args) {
        String s = "hellow";
    getStr((s1 -> {
        System.out.println(s1.toUpperCase());;}),s);
    }




    public static void getStr(Consumer<String>consumer,String s){
        consumer.accept(s);
    }
}
