package day07.day07_extend;

import static java.lang.Long.sum;

public class Test02 {
    public static void main(String[] args) {
       getSum(10,20,(a , b)->a + b);
    }

    public static void getSum(int num1,int num2,Sumable Calculator){
        System.out.println(Calculator.sum(num1,num2));
    }

}
