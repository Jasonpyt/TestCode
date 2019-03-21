package Demo01;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

/*
* 使用SimpleDateFormat类,把"2018-12-25"转换为"2018年12月25日". 计算500天前是几年几月几日，是一年中的第几天。
* */
public class Demo04 {
    public static void main(String[] args) throws ParseException {
        String str = "2018-12-25";
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = dateFormat.parse(str);
//        System.out.println(format);
        DateFormat dateFormat1 = new SimpleDateFormat("yyyy年MM月dd日");
        String format = dateFormat1.format(parse);
        System.out.println(format);
//
        Calendar calendar= Calendar.getInstance();

        calendar.setTime(parse);
        calendar.add(Calendar.DAY_OF_YEAR ,-500);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int tian = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println("前500天是:");

        System.out.println(year+"年" + month + "月" + day + "日" + "是这一年中的第" + tian + "天");

    }
}
