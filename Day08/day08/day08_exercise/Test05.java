package day08.day08_exercise;

import com.sun.xml.internal.org.jvnet.fastinfoset.sax.FastInfosetReader;

import java.util.function.Supplier;

public class Test05 {
    //str 是一个对象

    //调用功能strToChange
//        strToChange(()->{return str.toUpperCase();});
//        strToChange(()->str.toUpperCase());
        /*
           真正做事情的是 str对象  调用它的toUpperCase方法
         */
    public static void main(String[] args) {
        String str = "java";
        strToChang(str::toUpperCase);
    }
    public static void strToChang(Supplier<String >lambda){
        String s = lambda.get();
        System.out.println(s);
    }
}
