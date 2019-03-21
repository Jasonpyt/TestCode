package day09.day09_homework;

public class Test10_01 {
    public static void main(String[] args) {
        int countRubit = getCountRubit(24);
        System.out.println(countRubit);
    }
    public static  int getCountRubit(int mont){
        if (mont ==1 || mont ==2){
            return 1;
        }else{
            return getCountRubit(mont -1 )+ getCountRubit(mont -2);
        }
    }
}
