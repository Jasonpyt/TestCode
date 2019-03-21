package Demo02;

import java.util.ArrayList;
import java.util.Collection;

public class Test03 {
    public static void main(String[] args) {
        Collection <String> coll =  new ArrayList<>();
        coll.add("s");
        coll.add("ddd");
        coll.add("true");
        System.out.println(((ArrayList<String>) coll).get(2));//collection没有get方法如果对象需要使用该方法就必须向下转型
    }
}
