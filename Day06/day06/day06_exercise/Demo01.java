package day06.day06_exercise;

public class Demo01 {

        public static void main(String[] args){
            Thread t = new Thread(){
                public void run(){
                    System.out.println("我爱java");
                }
            };
          //  t.start()
            t.run();
    }
}
