package day04.day04_homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Test03pooker {
    public static void main(String[] args) {
        //1.准备牌
        //定义两个数组,一个存储4个花色,一个存储13个序号
        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        //创建HashMap集合,key存储牌的索引,value存储组装好的牌
        HashMap<Integer,String> poker = new HashMap<>();
        //创建ArrayList集合,存储牌的索引
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        //存储大王和小王
        //定义一个牌的索引,从0开始
        int index = 0;
        poker.put(index,"大王");
        pokerIndex.add(index);
        index++;
        poker.put(index,"小王");
        pokerIndex.add(index);
        index++;

        //循环嵌套遍历两个数组,组装52张牌(number数组必须写在外层)
        for (String number : numbers) {
            for (String color : colors) {
                //把组装好的牌存储到集合中
                poker.put(index,color+number);
                pokerIndex.add(index);
                index++;
            }
        }
        //System.out.println(poker);
        //System.out.println(pokerIndex);

        /*
            2.洗牌
            使用Collections中的方法shuffle,打乱集合中元素的顺序
         */
        Collections.shuffle(pokerIndex);
        //System.out.println(pokerIndex);

    /*
        3.发牌
     */
        //定义4个集合,存储玩家的牌和底牌
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();
        //遍历存储牌索引的ArrayList集合
        for (int i = 0; i < pokerIndex.size(); i++) {
            //获取每一个牌的索引
            Integer pi = pokerIndex.get(i);
            //先判断底牌
            if(i>=51){
                //给底牌发牌
                diPai.add(pi);
            }else if(i%3==0){
                //给玩家1发牌
                player01.add(pi);
            }else if(i%3==1){
                //给玩家2发牌
                player02.add(pi);
            }else if(i%3==2){
                //给玩家3发牌
                player03.add(pi);
            }

        }

        /*
            4.排序
            使用Collections中的sort方法,默认升序排序
         */
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(diPai);

        //调用看牌的方法
        lookPoker("刘德华",poker,player01);
        lookPoker("周润发",poker,player02);
        lookPoker("周星驰",poker,player03);
        lookPoker("底牌",poker,diPai);
    }



    /*
        定义一个看牌的方法
        参数:
            String name:玩家名称
            HashMap<Integer,String> poker:存储牌索引和组装牌的Map集合
            ArrayList<Integer> list:存储牌索引的玩家和底牌集合
        实现:
            遍历存储牌索引的玩家和底牌集合
            获取每一个牌的索引,牌的索引就是Map集合的key
            通过key找到Map集合的value
     */
    public static void lookPoker(String name,HashMap<Integer,String> poker,ArrayList<Integer> list){
        //先打印玩家名称,不换行
        System.out.print(name+" :");
        //遍历存储牌索引的玩家和底牌集合,获取每一个牌的索引,牌的索引就是Map集合的key
        for (Integer key : list) {
            //通过key找到Map集合的value
            String value = poker.get(key);
            System.out.print(value+" ");
        }
        //打印完玩家的牌或者底牌换行
        System.out.println();
    }
}
