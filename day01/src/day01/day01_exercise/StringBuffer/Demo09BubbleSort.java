package day01.day01_exercise.StringBuffer;
/*
* 冒泡排序原理是:两个相邻数据进行比较,最后进行数据的正确排序
*
*   第一次:arr[0]与arr[1],arr[1]与arr[2],arr[2]与arr[3],arr[3]与arr[4]比较4次
*   第二次:arr[0]与arr[1],arr[1]与arr[2],arr[2]与arr[3],比较3次
*   第三次:arr[0]与arr[1],arr[1]与arr[2],比较2次
*   第四次:arr[0]与arr[1],比较1次
* */
public class Demo09BubbleSort {
    public static void main(String[] args) {
        //调用两个方法
        int[] arr = {10,5,2,22,41};
        arraySort(arr);
        printArray(arr);
    }

    //定义一个利用冒泡原理进行数组排序的方法
    public static void arraySort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //定义方法打印数组
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
