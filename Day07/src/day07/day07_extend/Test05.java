package day07.day07_extend;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test05 {
    public static void main(String[] args) {
        String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女" };
        List<String> list = get(s -> s.split(",")[1].equals("女"),
                s -> s.split(",")[0].length() == 3, array);
        System.out.println(list);
    }

    public  static List<String> get(Predicate<String>name, Predicate<String>sex, String[] array){
     List<String> list = new ArrayList<>();
        for (String information : array) {
           if (sex.and(name).test(information)){
               list.add(information);
           }

        }
        return list;
    }
}
