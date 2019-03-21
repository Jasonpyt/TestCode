package day02.day02_homework;
/*
* 十一、编写一个泛型方法，实现任意引用类型数组指定位置元素交换。
* */
public class Test11 {
    public static void main(String[] args) {
        Integer [] arr = {1,2,3};
        method(arr,0,2);
    }

    public static <E>void method(E[] arr,int index,int index1){
        for (int i = 0; i < arr.length; i++) {
          E temp = arr[index];
            arr[index] = arr[index1];
            arr[index1] = temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

