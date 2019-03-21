package day06.day06_exercise;

import sun.security.timestamp.TSRequest;

public class Demo_Tickets {
    public static void main(String[] args) {
        Tickets ts = new Tickets();
       Thread t1 =  new Thread(ts,"售票口1");
       Thread t2 =  new Thread(ts,"售票口2");
       Thread t3 =  new Thread(ts,"售票口3");
       t1.start();
       t2.start();
       t3.start();
    }
}
