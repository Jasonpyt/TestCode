package day02.day02_homework;

import java.util.ArrayList;
import java.util.Collection;

/*六、定义一个方法listTest(ArrayList<String> al), 要求使用isEmpty()判断al里面是否有元素。
* */
public class Test06 {
    public static void main(String[] args) {
        Collection<String> coll= new ArrayList<>();
        coll.add("s");
        coll.clear();
        boolean b = listTest(coll);
        System.out.println(b);
    }

    private static boolean listTest(Collection<?> co) {

        return co.isEmpty();
    }
}
