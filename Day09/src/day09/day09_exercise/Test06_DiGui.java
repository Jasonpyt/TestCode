package day09.day09_exercise;

public class Test06_DiGui {
    public static void main(String[] args) {
        int n = 100;
        int sum = getSum(n);
        System.out.println(sum);

        long jieCheng = getJieCheng(100);
        System.out.println(jieCheng);
    }
    public  static  int getSum(int n){
        if (n == 1){
            return  1;
        }
        return n + getSum(n - 1);
    }
    public static  long getJieCheng(int n){
        if (n == 1){
            return  1;
        }
        return n * getSum(n-1);
    }


}
