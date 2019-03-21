package day06.day06_homework;
/*
* 编写一个Java程序，要求在同一个类中除main线程外，再开启一个线程，2个线程都循环执行20次。
* */
public class Test08 {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i <=20; i++) {
                    System.out.println("子线程输出" + i + "次") ;
                }
            }
        }.start();
        for (int i = 0; i <= 20; i++) {

            System.out.println("主线程输出" + i + "次");
        }
    }
}



