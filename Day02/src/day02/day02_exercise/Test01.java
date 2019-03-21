package day02.day02_exercise;

import java.util.ArrayList;

/*
* 能够说出集合与数组的区别:
    数组:    1.数组长度是固定的
*           2.可以存放任何类型的数据
*
*     集合:
*           1.长度可以改变
*           2.只能存放引用类型的数据,而且如果想要存放基本类型的数据就必须使用对应的包装类
* */
public class Test01 {
    public static void main(String[] args) {
        //使用数组声明一个对象arr
        int[] arr = {10,20,30,40};
        //打印数组长度
        System.out.println(arr.length);
        //arr = {10,20,30,40,50};不能再向原数组中添加数据否则会报错
        String[] st = {"aabc","cba"};
        //遍历数组
        for (int i = 0; i < st.length; i++) {
            System.out.println(st[i]);  //可以存储任何类型的数据

            System.out.println("============================");

            //创建集合
            //对于基本数据类型来说如果存放到集合当中必须把基本数据类型转换为对应的包装类称为装箱必须存放指定泛型的数据否则就会报错
            ArrayList<Integer> list = new ArrayList<>();

        }
    }
}
