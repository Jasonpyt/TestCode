package day05.day05_exercise;

public class Test09 {
    public static void main(String[] args) {
        Test09MyThread mt = new Test09MyThread();
        mt.run();
        mt.start();
        for (int i = 0; i < 20 ; i++) {
            System.out.println("主程序的方法"+ i);
        }
    }
}
