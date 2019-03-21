package day08.day08_exercise;

public class Cat implements Aniaml {
    @Override
    public void eat(String something) {
        System.out.println("猫吃" + something);
    }
}
