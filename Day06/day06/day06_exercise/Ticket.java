package day06.day06_exercise;

public class Ticket implements  Runnable {
    private int ticket = 100;
    Object lock = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {

                        e.printStackTrace();
                    }


                    String name = Thread.currentThread().getName();
                    System.out.println(name + "正在卖" + "第" + (ticket--) + "张票");
                }

            }
        }
    }
}
