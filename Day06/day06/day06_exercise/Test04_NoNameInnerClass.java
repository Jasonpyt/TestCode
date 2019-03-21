package day06.day06_exercise;

public class Test04_NoNameInnerClass {
    public static void main(String[] args) {
     /* Runnable target  = new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("狗蛋" + i);
                }
            }

      };*/
        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("狗蛋" + i);
                }
            }

        }).start();
        for (int i = 0; i < 200; i++) {
            System.out.println("小强" + i);
        }
    }
}
