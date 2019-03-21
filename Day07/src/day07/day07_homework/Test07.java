package day07.day07_homework;

public class Test07 implements Runnable{
    public static void main(String[] args) {
        Thread t = new Thread(new Test07());
        t.start();
    }


    public void run(int num) {
        for (int i = 0; i < num ; i++){
            System.out.println(i);
        }
    }

    @Override
    public void run() {

    }
}
