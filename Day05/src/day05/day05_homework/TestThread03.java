package day05.day05_homework;

public class TestThread03 extends  Thread  {
    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
           String c = "黑马程序员" + i;
            System.out.println(c);
        }
    }
}
