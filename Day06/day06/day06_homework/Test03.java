package day06.day06_homework;
/*
* 请编写程序，分别打印主线程的名称和子线程的名称。
		要求使用两种方式实现：
			第一种方式：继承Thread类。
			第二种方法：实现Runnable接口。
* */
public class Test03 {
    public static void main(String[] args) {
        MyThread my = new MyThread();
        my.run();
        my.start();

        System.out.println("主线程的名字是:"+ Thread.currentThread().getName());

        System.out.println("=========================================");

        MyRunnable mr = new MyRunnable();

        Thread th = new Thread(mr);

        th.run();

    }
}
class MyThread extends  Thread{
    @Override
    public void run() {
        System.out.println("子线程的名字是:"+Thread.currentThread().getName());
    }
}

class  MyRunnable implements  Runnable{
    @Override
    public void run() {
        System.out.println("子程的名字是" + Thread.currentThread().getName());
    }
}
