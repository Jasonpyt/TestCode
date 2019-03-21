package day07.day07_homework;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("我需要一个老师");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "老师" );
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("教我java,教完后，老师回到了办公室");
    }
}
