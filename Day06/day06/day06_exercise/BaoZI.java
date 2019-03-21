package day06.day06_exercise;

import java.util.ArrayList;

public class BaoZI extends  Thread {
    private ArrayList<String> plate ;
    public BaoZI(String name, ArrayList<String >plate) {
        super(name);
       this.plate = plate;
    }

    @Override
    public void run() {
        int index = 1;
        while (true){
            synchronized (plate) {
                if (plate.size() > 0) {
                    try {
                        plate.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

                //如果没有包子就开始做包子
                plate.add("做的第" + index + "包子" );
                System.out.println(plate);
                plate.notify();
            }
        }
    }
}
