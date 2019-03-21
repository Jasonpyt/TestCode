package day01.day01_homework;

import java.util.Calendar;

public class Test03 {
    public static void main(String[] args) {
        Calendar cl = Calendar.getInstance();
        int year = cl.get(Calendar.YEAR);
        cl.add(Calendar.MONTH,-6);
        cl.add(Calendar.DAY_OF_MONTH,-15);
        int month = cl.get(Calendar.MONTH);
        int day = cl.get(Calendar.DAY_OF_MONTH);
        int week = cl.get(Calendar.DAY_OF_WEEK_IN_MONTH);


        System.out.print(year + "年" + "0" +  month + "月" + "0" +  day + "日" + "周" + (week));
    }



}
