package day01.day01_exercise.Date;

import java.util.Date;

/*
*       Date类概述的是util包下的,不是sql包的
*           Date类表示特定的瞬间,精确到毫秒
*
*       构造方法:
*
*      1. Day01.Date()
          分配 Day01.Date 对象并初始化此对象，以表示分配它的时间（精确到毫秒）。

       2.Day01.Date(long date)
          分配 Day01.Date 对象并初始化此对象，以表示自从标准基准时间（称为“历元（epoch）”
          即 1970 年 1 月 1 日 00:00:00 GMT）以来的指定毫秒数。

       成员方法:

       1.long getTime()
          返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Day01.Date 对象表示的毫秒数。

       2.void setTime(long time)
          设置此 Day01.Date 对象，以表示 1970 年 1 月 1 日 00:00:00 GMT 以后 time 毫秒的时间点。

*
* */
public class Demo01_Method {
    public static void main(String[] args) {
        //利用Date()创建对象d1
        Date d1 = new Date();
        //显示d1的值
        System.out.println(d1);//分配 Day01.Date 对象并初始化此对象，以表示分配它的时间（精确到毫秒）。就是当前时间

        //利用 2.Day01.Date(long date)创建对象d2
        Date d2 = new Date(10L);
        //显示
        System.out.println(d2);//Thu Jan 01 08:00:00 CST 1970

        //获取指定时间的毫秒数
        long se = d1.getTime();
        //打印输出
        System.out.println(se);//返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Day01.Date 对象表示的毫秒数。
        System.out.println(System.currentTimeMillis());//通过系统类的方法获取当前时间毫秒值

        System.out.println("===================================");
        //利用void setTime(long time)设置毫秒值
        Date d3 = new Date();
        d3.setTime(99999999);//设置毫秒值改变时间对象打印结果为:
        //输出
        System.out.println(d3);//Thu Jan 01 08:00:10 CST 1970
    }
}
