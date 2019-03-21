package day06.day06_homework;

public class Test06 {
    public static void main(String[] args) {
        MyRunableing mying = new MyRunableing();
        Thread th = new Thread(mying);
        th.start();
        for (int i = 0; i < 20; i++) {

            System.out.println(Thread.currentThread().getName() + i);
        }

    }
}
class  MyRunableing implements  Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程:" + Thread.currentThread().getName() + i);
        }
    }
}
