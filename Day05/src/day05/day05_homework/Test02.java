package day05.day05_homework;

public class Test02 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }

}
