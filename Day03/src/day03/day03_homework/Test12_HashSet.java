package day03.day03_homework;

import java.util.HashSet;
import java.util.Random;

/*
* 双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。红色球号码从1—33中选择；
* 蓝色球号码从1—16中选择；请随机生成一注双色球号码。（要求同色号码不重复）
* */
public class Test12_HashSet {
    public static void main(String[] args) {


        HashSet<Integer> ball = new HashSet<>();

        while(ball.size() < 6)

        //红色球
        {
            Integer num = new Random().nextInt(33) + 1;
            ball.add(num);
        }


        int blueBall = new Random().nextInt(16) + 1;
        System.out.println("抽到的红色球分别是:");
        for (Integer integer : ball) {
            System.out.print(integer + " ");
        }
        System.out.println();
        System.out.println("蓝色球是:" +blueBall);


    }


        }




