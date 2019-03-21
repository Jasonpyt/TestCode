package day08.day08_exercise;

import java.util.function.Consumer;

public class Test04 {
    public static void main(String[] args) {
        String s = "hello";

        // 调用printStr功能
//        printStr((String ss)->{System.out.println(ss);}, s);
        //printStr(ss->System.out.println(ss),s);
        /*
            在这个lambda表达式中 {}中 真正做事情的是 System.out对象
            将 参数给  System.out的println()完成
         */
        String str = "hello";
        printStr((System.out::println),str);

    }

    public static  void printStr(Consumer<String> lambda,String str){
        lambda.accept(str);
    }
}
