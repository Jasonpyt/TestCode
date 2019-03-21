package day06.day06_homework;

public class Tunnel implements Runnable {
   private  int countNum = 0;

    @Override
    public void run() {
        cross();
    }

    public  synchronized void cross(){
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        countNum++;

        System.out.println(Thread.currentThread().getName() + "已经通过隧道,TA是第" + countNum + "通过的!");
    }
}
