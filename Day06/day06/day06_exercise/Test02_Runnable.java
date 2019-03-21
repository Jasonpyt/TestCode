package day06.day06_exercise;

public class Test02_Runnable {
    public static void main(String[] args) {
        //创建自定义类对象 线程任务对象
        MyRunnable mr = new MyRunnable();
        //创建线程对象
        Thread t = new Thread(mr,"小强");
        t.start();//开启线程
        for (int i = 0; i < 20; i++) {
            System.out.println("旺财" + i);
        }
    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName());//currentThread() 返回对当前正在执行的线程对象的引用。

        }
    }
}
