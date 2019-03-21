package day05.day05_homework;

public class TestThread01 extends  Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            Integer a = i;
            System.out.println(i);
        }
    }
}
