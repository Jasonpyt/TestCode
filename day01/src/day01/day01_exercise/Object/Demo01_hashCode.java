package day01.day01_exercise.Object;

import java.text.ParseException;

/*
*       Object类:
*               java.lang.Day01.Object 类是Java语言中的根类，即所有类的父类。它中描述的所有方法子类都可以使用。在对象实例化的时候，最终找的父类就是Object。
*               如果一个类没有特别指定父类， 那么默认则继承自Object类
*           1.构造方法:
*               Day01.Object()
*
*            2.方法:
*               2.1  int  hashCode()  :返回该对象的哈希码值。

*
* */
public class Demo01_hashCode {
    public static void main(String[] args) throws ParseException {
        //利用Object类的构造方法创建一个对象obj
        Object obj = new Object();

        //使用hashCode()方法获取该对象的哈希马值
        int hc = obj.hashCode();
        //打印哈希值
        System.out.println(hc);     //356573597(在内存中的地址值)


    }


}
