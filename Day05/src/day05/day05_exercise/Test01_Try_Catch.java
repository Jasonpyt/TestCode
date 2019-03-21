package day05.day05_exercise;
/*
* 世界上最真情的相依就是你在try我在catch,无论你发神马脾气,我都静静接收默默处理
* 当通过tryCatch将问题处理了,程序会继续执行
* */
public class Test01_Try_Catch {
    public static void main(String[] args) {
        //调用方法
        //使用try...catch排除异常
        try {
            int avg = getAvg(10, 0);
            System.out.println(avg);//除数为0爆出java.lang.ArithmeticException:异常
        }catch(ArithmeticException a){
            System.out.println("除数为0了");
        }
        System.out.println("程序问题排除继续执行");

    }

    //定义一个求除数的方法
    public static int getAvg(int a,int b){
        return a / b;
    }
}
