package day01.day01_homework;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//使用SimpleDateFormat类,把2018-03-04转换为2018年03月04日。
public class Test09 {
    public static void main(String[] args) throws ParseException {
        String str = "2018-03-04";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse(str);
        DateFormat dateFormat = new SimpleDateFormat("YYYY年MM月dd日");
        String s = dateFormat.format(parse);
        System.out.println(s);
    }
}
