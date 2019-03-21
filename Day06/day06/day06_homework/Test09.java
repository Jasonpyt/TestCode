package day06.day06_homework;

import java.util.ArrayList;

/*
* 请按要求编写多线程应用程序，模拟多个人通过一个山洞：
		1.这个山洞每次只能通过一个人，每个人通过山洞的时间为5秒；
2.随机生成10个人，同时准备过此山洞，并且定义一个变量用于记录通过隧道的人数。显示每次通过山洞人的姓名，和通过顺序；
*
* */
public class Test09 {
    public static void main(String[] args) throws InterruptedException {
       new Thread(){
           @Override
           public void run() {
               for (int i = 1; i < 11; i++) {
                   System.out.println("第" + i + "人通过");
               }
           }
       }.start();
       int count = 1;

        Thread.sleep(500000000);
        while (true){
           synchronized ("") {
               if (count > 11) {
                   try {
                       "".wait();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                       count++;
                   }
               }
               System.out.println(count);
           }
       }
    }
}
