package day01.day01_exercise.System;

public class Demo01System {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] newArr = {6,7,8,9,10};
        System.arraycopy(arr,0,newArr,0,3);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");

        }
    }
}
