package day05.day05_exercise;
/*
* try后面如果有多个catch,那么小异常放前面,大的异常放后面,根据多态的原理,如果大的放前面,会将所有子类对象接收,后面的catch就没有了意义
* */
public class Test02_Try_Catch {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int[] arr = {11,22,33,44,55};
//1.7之后的多个catch的写法
        try{

            System.out.println(a / b);
            System.out.println(arr[10]);
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e ){
            System.out.println("出现异常");
        }
//1.7之前的写法一旦遇到符合异常的结果后面的情况将不再执行
        try {
            System.out.println(a / b);
            System.out.println(arr[10]);
        }catch (ArithmeticException c){
            System.out.println("不能为0");
        }catch (ArrayIndexOutOfBoundsException f){
            System.out.println("索引越界异常");
        }catch (Exception e){
            System.out.println("出错了");
        }
    }
}
