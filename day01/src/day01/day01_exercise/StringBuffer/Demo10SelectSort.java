package day01.day01_exercise.StringBuffer;
/*
* 选择排序:
*       每轮都是第一个与后面的元素进行比较,最后进行排序
* */

public class Demo10SelectSort {
    public static void main(String[] args) {
    int[] arr = {10,20,30,5,1};
    selectsort(arr);
    printArray(arr);
    }

    //定义选择排序的方法
    public static void selectsort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1;j < arr.length;j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
    }

    //定义遍历数组的方法
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
