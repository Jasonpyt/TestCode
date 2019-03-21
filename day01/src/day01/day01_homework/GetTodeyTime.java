package day01.day01_homework;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetTodeyTime {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        System.out.println("=====================================================");
        /*DateFormat df = new SimpleDateFormat("YYYY-MM-dd EE HH:mm:ss");
        String s = df.format(date);
        System.out.println(s);*/
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY年MM月dd日");

        String format = sdf.format(d);
        System.out.println(format);


    }
}
