package day06.day06_exercise;

public class Tickets implements Runnable {
    private  int tickets = 100;

    @Override
    public void run() {

        while (true) {
            synchronized ( "locke") {
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + (tickets--) + "张票");
                }
            }
        }
    }
}
