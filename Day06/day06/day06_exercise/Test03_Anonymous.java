package day06.day06_exercise;

public class Test03_Anonymous {
    public static void main(String[] args) {
      // new Runnable(){
      //     @Override
      //     public void run() {
      //         for (int i = 0; i < 20; i++) {
      //             System.out.println("张宇:" + i);
      //         }
      //     }
      // };//这个整体相当于new MyRunnable()

        Runnable r = new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("张宇:" + i);
                }
            }
        };
        new Thread(r).start();

        for (int i = 0; i < 20; i++) {
            System.out.println("费玉清:" + i);
        }
    }
}
