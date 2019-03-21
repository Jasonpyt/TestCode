package Demo02;

import java.util.HashMap;
import java.util.Map;

public class Test15 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("aaa","xxx");
        map.put("bbb","yyy");
        map.put("aaa","zzz");
        System.out.println(map);

    }
}
