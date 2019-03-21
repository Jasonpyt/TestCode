package Demo02;

public class Test20 {
    public static void main(String[] args) {
//        new Thread( ()->{System.out.println("线程开启咯")} ).run();
//        new Thread( (a)->{System.out.println("线程开启咯"+a)} ).start();
//        new Thread( ()->{System.out.println("线程开启咯")} ).start();
//        new Thread( run()->{System.out.println("线程开启咯")} ).start();
        new  Thread(()-> {System.out.println("线程开启咯");}).start();
    }
}
