package Demo01;

import java.util.*;

/*
* 有四种水果(苹果，香蕉，西瓜，橘子)
	 1、给每种水果设定一个商品号，商品号是8个0-9的随机数，商品号码不能重复, 最小值 "00000001", 最大值 "99999999"
	 2、根据商品号查询对应的商品。
如果查不到输出：“查无此商品”
如果能查到打印：”根据商品号：12345678，查询到对应的商品为：西瓜”
* */
public class Demo07 {
    public static void main(String[] args) {
        HashMap<String, String> fruits = new HashMap<>();
        String id = getId();
        if(isChongFu(fruits,"苹果",id)) {
            fruits.put(id, "苹果");
        }
        String id1 = getId();
        if(isChongFu(fruits,"香蕉",id1)){
            fruits.put(id1,"香蕉");
        }
        String id2 = getId();
        if(isChongFu(fruits,"西瓜",id2)){
            fruits.put(id2,"西瓜");

        }
        String id3 = getId();
        if(isChongFu(fruits,"橘子",id3)){
            fruits.put(id3,"橘子");
        }
        Set<String> set = fruits.keySet();
        for (String s : set) {
            String s1 = fruits.get(s);
            System.out.println(s+":"+s1);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品号");
        String num = sc.next();
        if(fruits.containsKey(num)){
            String fruit = fruits.get(num);
            System.out.println("根据商品号："+num+"查询到对应的商品为"+fruit);
        }else{
            System.out.println("查无此商品");
        }
    }
    public static Boolean isChongFu(HashMap  fruits,String fruit,String id){
        boolean flag=false;
        if(fruits.isEmpty()){
            flag=true;
        }else {
            if(!fruits.containsKey(id)){
                flag=true;
            }
        }
        return flag;
    }
    public static String getId(){
        String id="";
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            int num = random.nextInt(10);
            id+=num;
        }
        return id;
    }


}


