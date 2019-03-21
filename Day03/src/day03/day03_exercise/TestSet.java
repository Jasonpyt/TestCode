package day03.day03_exercise;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        //创建Set对象利用多态的方式
        HashSet<Object> set = new HashSet<>();
        //添加数据
        set.add(123);
        set.add(123);
        set.add(456);
        //遍历集合
        for (Object o : set) {
            System.out.println(o);//456 123 无序不能重复
        }
    }
}
