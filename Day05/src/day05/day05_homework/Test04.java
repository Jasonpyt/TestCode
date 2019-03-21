package day05.day05_homework;

public class Test04 {
    public static void main(String[] args) {
      long s1 =   System.currentTimeMillis();
        TestThread01 t1 = new TestThread01();
        TestThread02 t2 = new TestThread02();
        TestThread03 t3 = new TestThread03();
        t1.run();
        t2.run();
        t3.run();
        long l2 = System.currentTimeMillis();
        System.out.println((l2 - s1) );
    }
}
