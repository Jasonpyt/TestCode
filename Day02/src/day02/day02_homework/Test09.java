package day02.day02_homework;

import java.util.ArrayList;

/*
* 十一、编写一个泛型方法，实现任意引用类型数组指定位置元素交换。
* */
public class Test09 {
    public static void main(String[] args) {
        Object[] arr = {1,2,3,4,5};
        getReturn(arr,0,5);
    }

    public  static <Object>void getReturn ( Object[] arr,int index ,Object s) {
        ArrayList<Object> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            list.set(index, s);
            System.out.print(list.get(i) + " ");
        }


        System.out.println("=======================================");
    }

}
