package day07.day07_homework;

public class Test06 {
    public int start = 1;
    public int end = 99;

    public static void main(String[] args) {
        new Test06().method();
    }


    private void method() {

      Thread t   = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = start; i <= end; i++){
                    System.out.println(i);
                }
            }
        });
        t.start();
    }
}
