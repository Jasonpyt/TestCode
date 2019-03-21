package day02.day02_homework;
/*
* 十二、编写一个泛型方法，接收一个任意引用类型的数组，并反转数组中的所有元素
*
* arr[0] <--->arr[arr.length-1]  i = 0
* arr[1] <---->arr[arr.length-2]    i = 1
* arr[2]<----------->arr[arr.length-3] i = 2
* */
public class Test10 {
    public static void main(String[] args) {
        Object[] arr = {1,2,3,4,5,6};
        reverse(arr);
    }

    public static void reverse(Object[] arr){
        for (int start = 0 ,end = arr.length-1; start < end; start++,end--) {
            Object o = arr[start];
            arr[start] = arr[end];
            arr[end] =o;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        }
    }


