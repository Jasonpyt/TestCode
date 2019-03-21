package day07.day07_homework;

import java.util.function.Predicate;

public class Test14 {
    public static void main(String[] args) {
        Integer[] arr = {-12345,9999,520,0,-38,-7758520,941213};
     Predicate<Integer> p1 = (s) -> s >= 0;
     Predicate<Integer>p2 = (s) -> Math.abs(s) > 100;
     Predicate<Integer> p3  = (s) -> s %2 == 0;
     int count1 = 0;
     int count2 = 0;
     int count3 =0;
     int count4 = 0;
     for (Integer i : arr){
         if (p1.test(i)){
             count1++;
         }

         if (p1.negate().test(i)){
             count2++;
         }
         //统计绝对值大于100的偶数个数
         if (p2.and(p3).test(i)){
             count3++;
         }
         //统计是负整数或偶数的数的个数
         if (p1.negate().or(p3).test(i)){
             count4++;
         }
     }
        //分别打印结果
        System.out.println("自然数的个数为："+count1);
        System.out.println("负整数的个数为："+count2);
        System.out.println("绝对值大于100的偶数的个数为："+count3);
        System.out.println("是负整数或偶数的数的个数为："+count4);
    }
     }




