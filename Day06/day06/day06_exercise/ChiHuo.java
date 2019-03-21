package day06.day06_exercise;

import java.util.ArrayList;

public class ChiHuo extends  Thread{
       private  ArrayList<String>plate;
    public ChiHuo(String name, ArrayList<String> plate) {
        super(name);
        this.plate = plate;}

    @Override
    public void run() {

        while (true){
            synchronized (plate){
                if (plate.size() == 0 ){
                    try {
                        plate.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                }
                //否则就开始造
                plate.remove(0);
                System.out.println("我吃完了包子,再来....");
                plate.notify();
            }
        }
    }
}



