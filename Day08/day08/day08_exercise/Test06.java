package day08.day08_exercise;
/*
        对象名--引用成员方法
        lambda表达式 n->对象.方法名(n)

        方法引用
        对象::方法名


        类名--引用静态方法
        lambda表达式 n->类.方法名(n)

        方法引用
        类::方法名

        */
import java.util.function.Supplier;

public class Test06 {
    public static void main(String[] args) {

        getNum(() ->{
           return  Math.random();
        });
        getNum(Math::random);
    }
    public static  void getNum(Supplier<Double>supplier){
        Double num = supplier.get();
        System.out.println(num);
    }
}
