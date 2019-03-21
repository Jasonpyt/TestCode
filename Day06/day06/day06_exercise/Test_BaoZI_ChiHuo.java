package day06.day06_exercise;

import java.util.ArrayList;

public class Test_BaoZI_ChiHuo {
    //需要拥有一个盘子用来存放包子
    public static void main(String[] args) {
        ArrayList<String > plate = new ArrayList<>();
        //创建两个进程
        BaoZI baoZI = new BaoZI("包子铺",plate);
        ChiHuo chiHuo = new ChiHuo("吃货",plate);
        baoZI.start();
        chiHuo.start();

    }

}
