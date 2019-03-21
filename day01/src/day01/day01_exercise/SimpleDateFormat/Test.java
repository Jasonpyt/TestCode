package day01.day01_exercise.SimpleDateFormat;

import com.sun.org.apache.xpath.internal.operations.String;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* 需求:
*       计算自己来到这个世界多久了
*
* */
public class Test {

    public static void main(String[] args) throws ParseException {
        //将生日字符串和今天字符串存在String类型变量中
        java.lang.String birthday = "1995年08月23日";
        java.lang.String today = "2018年10月18日";
        //定义日期格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY年MM月dd日");
        //将日期字符串转换为日期对象
        Date d1 = sdf.parse(birthday);
        Date d2 = sdf.parse(today);
        //求出毫秒值
        long l = d2.getTime() - d1.getTime();
        System.out.println(l / 1000 / 60 /60 /24);
    }
}
