package day07.day07_extend;

import java.util.function.Consumer;

public class Test04 {
    public static void main(String[] args) {
        String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男" };
        concat(s -> System.out.println("姓名:" + s.split(",")[0]),
                s -> System.out.println("性别: "+s.split(",")[1]),
                array);
    }
    public static  void concat(Consumer<String> name,Consumer<String> sex,String[] arr){
        for (String infor : arr) {

            name.andThen(sex).accept(String.valueOf(infor));
        }
    }
}
