package day08.day08_homework;


import day08.Helper;

public class Son extends  Father {
    public static void main(String[] args) {
        Son son = new Son();
        son.daJiangYou();
    }

    @Override
    public void askMoney() {
        System.out.println("向家中的财政老大要钱交(上)学(网)费(吧)...");
    }
    @Override
    public void spendMoney() {
        System.out.println("去网吧付钱给网管开了一台机器...");
    }
    public void helpFather(Helper helper) {
        helper.help();
    }

    public  void daJiangYou(){
        helpFather(super::spendMoney);
        helpFather(super::askMoney);

    }
}
