package day05.day05_exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Test07 {

    public static ArrayList<String> list = new ArrayList<>();
    static {
        list.add("张三丰");
        list.add("张无忌");
        list.add("郭靖");
        list.add("黄蓉");
    }
    public static void main(String[] args) {
        System.out.println("请输入注册名称:");
        String inputMessage = new Scanner(System.in).nextLine();
        try{
            getName(inputMessage);
            System.out.println("注册成功");
        } catch (Test07_RegisterException e) {
            e.printStackTrace();
        }
        System.out.println("over");


    }

    public static boolean getName(String userName) throws Test07_RegisterException {
        if (list.contains(userName)) {
            throw  new Test07_RegisterException("亲已经注册过了");
        }
        return true;
        }

    }

