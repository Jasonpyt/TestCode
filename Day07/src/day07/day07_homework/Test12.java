package day07.day07_homework;
import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Calendar;
import java.util.HashSet;
import java.util.function.Supplier;
public class Test12 {
    public static <T> T getObj(Supplier<T> supplier) {
        return supplier.get();
    }


    public static void main(String[] args) {
        String[] obj1 = getObj(() -> new String[5]);

       HashSet<Integer> obj2 = getObj(() ->{
           HashSet<Integer> integers = new HashSet<>();
           while (integers.size() < 5){
               integers.add((int)(Math.random()*20 + 1));
           }
           return integers;
       });
        Calendar Obj3 = getObj(() ->{
            Calendar instance = Calendar.getInstance();
            instance.set(Calendar.YEAR,2018);
            instance.set(Calendar.MONTH,4);
            instance.set(Calendar.DAY_OF_MONTH,1);
            return  instance;
        });

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(Obj3);
    }

}
