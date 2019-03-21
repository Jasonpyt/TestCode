package day01.day01_exercise.Calendar;
/*
* Calendar为抽象类，不能直接创建对象，而是通过静态方法创建，返回子类对象，如下：
        Calendar静态方法
                public static Day01.Calendar getInstance() ：使用默认时区和语言环境获得一个日历
* */

import java.util.Calendar;

public class Demo01CalendarMethod {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
//        Day01.System.out.println(cal);
        //显示年
        System.out.println(cal.get(Calendar.YEAR));
        //显示月
        System.out.println(cal.get(Calendar.MONTH));//9
        //显示日
        System.out.println(cal.get(Calendar.DATE));
        //显示周
        System.out.println(cal.get(Calendar.WEDNESDAY));

        //显示最终显示的具体日子
        System.out.println(cal.get(Calendar.YEAR) + "年" + cal.get(Calendar.MONTH )  + "月" + getWeek(cal.get(Calendar.WEEK_OF_MONTH)));
    }

    //定义方法存储表中的星期
    public static String getWeek(int week){
        String[] arr = {" ","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
        return arr[week];
    }
}
