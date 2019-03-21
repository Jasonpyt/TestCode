package day07.day07_homework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test08 {

    public static void main(String[] args) {
        MyRunnable my = new MyRunnable();
        ExecutorService pool = Executors.newFixedThreadPool(2);

        System.out.println( pool.submit(my));
        pool.shutdown();
    }


}
