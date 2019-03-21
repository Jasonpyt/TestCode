package Demo02;

import java.util.ArrayList;
import java.util.Collection;

public class Test02 {
    public static void main(String[] args) {
        Collection<String> arr=new ArrayList<String>();
        arr.add("张无忌");
        arr.add("张翠山");
        arr.add("赵敏");
        arr.add("杨不悔");

        for (String str : arr) {
            if (str.equals("张翠山")){
                arr.remove(str);
            }
        }
        for (String name : arr) {
            System.out.println(name);//当方法检测到对象的并发修改，但不允许这种修改时，抛出此异常java.util.ConcurrentModificationException
        }
    }
}
