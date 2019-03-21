package day05.day05_exercise;

public class Test09MyThread extends  Thread {
    @Override
    public void run() {
        for (int i = 0 ; i < 10 ; i ++){
            System.out.println("我自己的线程");
        }
    }
}
