package day05.day05_exercise;

import day05.day05_exercise.Test04_ArrayTools;

public class Test05_ArrayToolsTe {
    public static void main(String[] args) {
        int[] arr = {34,12,67};
        int num = Test04_ArrayTools.getElement(arr, 4);
        System.out.println("num =" + num);
        //System.out.println("over");// java.lang.ArrayIndexOutOfBoundsException: 4
    }
}
