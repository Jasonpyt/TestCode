package day01.day01_homework;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入您的出生年月格式为:YYYY-MM-dd");
        String String = new Scanner(System.in).nextLine();
        //将字符串转为Date对象
        DateFormat df = new SimpleDateFormat("YYYY-MM-dd");
        long birth = df.parse(String).getTime();
        //获取当前时间的毫秒值
        //long tod = new Date().getTime();
        long l = System.currentTimeMillis();

        System.out.println("您活了" + ((l - birth) / 1000 / 60/60/24/365) + "岁");

    }
}
