package day09.day09_homework;

public class Test11 {
    public static void main(String[] args) {
        int count = getCount(1);
        System.out.println(count);
    }

    public static int getCount(int day){


            if (day ==  10){
                return  1;
            }else{
                return getCount(day + 1)*2;
            }

        }
    }

