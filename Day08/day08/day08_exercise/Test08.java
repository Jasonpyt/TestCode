package day08.day08_exercise;

import java.util.function.Function;

public class Test08 {
    public static void main(String[] args) {
        int[] array = createArray((len -> new int[len]), 5);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("================================");
        int[] array1 = createArray(int[]::new, 3);
        for (int i : array1) {
            System.out.println(i);
        }
    }

    public static  int[]  createArray(Function<Integer,int[]>function,int length){
        int[] apply = function.apply(length);
        return  apply;
    }
}
