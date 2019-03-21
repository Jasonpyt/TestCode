package day02.day02_homework;

import java.util.ArrayList;
import java.util.Collection;

/*三、定义一个方法，要求此方法把int数组转成存有相同元素的集合(集合里面的元素是Integer)，并返回。*/
public class Test03 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        Collection<Integer> list = getList(arr);
        System.out.println("集合中的元素有:" + list);
    }
    public static Collection<Integer>getList(int[] arr){
        Collection<Integer>list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return  list;
    }
}
