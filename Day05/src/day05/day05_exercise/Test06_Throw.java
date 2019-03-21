package day05.day05_exercise;

public class Test06_Throw {
    public static void main(String[] args) {
        //创建一个数组
        int[] arr = {2,4,52,2};
        //根据索引找对应的元素
        int index = 4;
        int num = getElement(arr, index);
        System.out.println(num);
    }
    /*
     * 根据 索引找到数组中对应的元素
     */
    public static  int getElement(int[] arr,int index){
        //判断索引是否越界
    if (index < 0 || index > arr.length -1){
         /*
             判断条件如果满足，当执行完throw抛出异常对象后，方法已经无法继续运算。
             这时就会结束当前方法的执行，并将异常告知给调用者。这时就需要通过异常来解决。
              */
         throw  new ArrayIndexOutOfBoundsException("哥们，角标越界了~~~");
    }
        int element = arr[index];
    return  element;
    }


}