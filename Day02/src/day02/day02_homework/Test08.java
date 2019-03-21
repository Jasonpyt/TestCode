package day02.day02_homework;

import java.util.ArrayList;

/*
* 十、产生10个1-100的随机数，并放到一个数组中，把数组中大于等于10的数字放到一个list集合中，并打印到控制台。
* */
public class Test08 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
        System.out.println("大于等于10的数字有:");
        getNum(arr);
    }

    //定义一个方法打印集合
    public static void getNum(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 10) {
                list.add(arr[i]);
            }


        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
