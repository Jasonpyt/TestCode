package day05.day05_homework;

public class TestThread02 extends  Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            String b = "黑马程序员";
            System.out.println(b);
        }
    }
}
