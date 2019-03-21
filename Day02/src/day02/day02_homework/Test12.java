package day02.day02_homework;

import java.util.ArrayList;
import java.util.Collections;

public class Test12 {
    public static void main(String[] args) {
        //准备牌
        //需要一个集合来存放扑克
        ArrayList<String> puke = new ArrayList<>();
        //创建集合存储花色
        ArrayList<String> colors = new ArrayList<>();
        //创建数字集合
        ArrayList<String> number = new ArrayList<>();
        //向花色和数字集合中添加元素
        colors.add("♥");
        colors.add("♦");
        colors.add("♠");
        colors.add("♣");
        number.add("A");
        number.add("2");
        number.add("3");
        number.add("4");
        number.add("5");
        number.add("6");
        number.add("7");
        number.add("8");
        number.add("9");
        number.add("10");
        number.add("J");
        number.add("Q");
        number.add("K");
        puke.add("大王");
        puke.add("小王");
        for (int i = 0; i < colors.size(); i++) {
            for (int i1 = 0; i1 < number.size(); i1++) {
                puke.add(colors.get(i) + number.get(i1));
            }
        }


        //洗扑克
        Collections.shuffle(puke);
       // System.out.println(puke);
//定义四个集合用来存储不同人的牌
        ArrayList<String>play01 = new ArrayList<>();
        ArrayList<String>play02 = new ArrayList<>();
        ArrayList<String>play03 = new ArrayList<>();
        ArrayList<String>dipai = new ArrayList<>();
        for (int i = 0; i < puke.size(); i++) {
            String zhipai = puke.get(i);
            if (i >= 51){
                dipai.add(zhipai);
            }else if(i%3 == 0){
                play01.add(zhipai);
            }else if (i % 3 == 1){
                play02.add(zhipai);
            }else if (i % 3 == 2){
                play03.add(zhipai);
            }
        }

        System.out.println("刘德华:" + play01);
        System.out.println("周星驰:" + play02);
        System.out.println("周润发:" + play03);
        System.out.println("底牌:" + dipai);
    }
}
