package day04.day04_exercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
* java.util.Map<K,V>接口
* Map接口的特点:
*       1.Map集合是一个双列集合,一个元素有key,value值组成
*       2.Map集合中的key是不允许重复的,value可以重复
*       3.Map集合中key与value是一一对应的
*       4.Map集合的key与value泛型的数据类型可以心相同,也可以不同
*
* java.util.HashMap<k,v>集合 implements Map<k,v>接口
    HashMap集合的特点:
        HashMap底层是一个哈希表
            1.8之前:数组+单向链表
            1.8之后:数组+红黑树
        HashMap集合是一个无序的集合(存储元素和取出元素顺序有可能不一致)

* */
public class Test01 {
    public static void main(String[] args) {

        show04();
        show03();
        show01();
        show02();


            }

              /*
         boolean containsKey(Object key)  判断Map集合中是否包含指定的key
            返回值:
                包含,返回true
                不包含,返回false
     */

    private static void show04() {
        //创建Map集合对象,key使用String,value使用Integer
        Map<String,Integer>map = new HashMap<>();
        map.put("柳岩",18);
        map.put("迪丽热巴",18);
        map.put("柳岩",18);
        map.put("马尔扎哈",28);
        boolean b1 = map.containsKey("柳岩");
        System.out.println("b1:"+b1);//b1:true

        boolean b2 = map.containsKey("岩柳");
        System.out.println("b2:"+b2);//b2:false

        boolean b3 = map.containsValue(18);
        System.out.println("b3:"+b3);//b3:true


    }

     /*
        V remove(Object key)  通过key移除Map集合中对应的键值对
            返回值:
                key存在,移除对应的键值对,返回被移除的value值
                key不存在,返回null
     */

     private  static void show03(){
         Map<String,Integer>map = new HashMap<>();
         map.put("柳岩",18);
         map.put("迪丽热巴",18);
         map.put("柳岩",18);

         Integer remove = map.remove("马尔扎哈");
         System.out.println("remove" + remove);//28
         System.out.println(map);

         Integer remove1 = map.remove("杨幂");
         System.out.println("remove1:" + remove1);//null
         System.out.println(map);


     }

    /*
        V get(Object key)  通过key获取value值
           返回值:
               key存在,返回对应的value
               key不存在,返回null
    */
    private static void show02() {
        //创建Map集合对象,key使用String,value使用Integer
        Map<String,Integer> map = new HashMap<>();
        map.put("柳岩",18);
        map.put("迪丽热巴",18);
        map.put("马尔扎哈",28);
        map.put("杨幂",null);

        Integer v1 = map.get("迪丽热巴");
        System.out.println("v1:"+v1);//18

        Integer v2 = map.get("杨幂");
        //int v2 = map.get("杨幂");//NullPointerException
        System.out.println("v2:"+v2);//v2:null

        Integer v3 = map.get("杨颖");
        System.out.println("v3:"+v3);//v3:null
    }

    /*
        V put(K key, V value)  往Map集合中添加元素(键值对)
            返回值:
                添加的元素的key不重复,v返回null
                添加的元素的key重复,会用新的value替换原有value,返回v就是被替换的value值
     */
    private static void show01() {
        //创建Map集合对象,key与value都是String
        Map<String,String> map = new HashMap<>();

        String v1 = map.put("李晨", "范冰冰1");
        System.out.println("v1:"+v1);//v1:null

        String v2 = map.put("李晨", "范冰冰2");
        System.out.println("v2:"+v2);//v2:范冰冰1

        map.put("杨过","小龙女");
        map.put("郭靖","黄蓉");

        System.out.println(map);//{杨过=小龙女, 李晨=范冰冰2, 郭靖=黄蓉}
    }




        }



