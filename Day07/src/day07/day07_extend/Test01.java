package day07.day07_extend;

public class Test01 {
    public static void main(String[] args) {
        getEat(()-> System.out.println("小美女吃饭饭"));
    }
    public static  void getEat(Eatable eatable){
        eatable.eat();
    }
}
