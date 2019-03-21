package day05.day05_homework;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        System.out.println("请输入角色名称:");
        Scanner sc = new Scanner(System.in);
        String player01 = sc.nextLine();
        System.out.println("请输入角色生命值:");
        int live = sc.nextInt();


        Player p1 = new Player();
        p1.setName(player01);
        p1.setLive(live);
        try{
            getLive(live);
            System.out.println("角色创建成功!!");
        }catch (MyException e){
            e.printStackTrace();
        }
    }

    public static  boolean getLive(int live) throws MyException {
        if (live < 0 | live > 100){
            throw  new MyException("Error");
        }
        return  true;
    }
}
class  Player{
    private  String name;
    private  int live;

    public Player() {
    }

    public Player(String name, int live) {
        this.name = name;
        this.live = live;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLive() {
        return live;
    }

    public void setLive(int live) {
        this.live = live;
    }
}