package day08.day08_exercise;
/*
        lambda 重点是做什么 而不是形式
          拿什么去完成什么事情
     */
public class Test03 {
    public static void main(String[] args) {
        Cat cat = new Cat();

   feed((String s) ->{
       System.out.println("猫吃" + s);},"鱼");
   }

    public static  void feed(Aniaml a,String some){
        a.eat(some);
    }
}
