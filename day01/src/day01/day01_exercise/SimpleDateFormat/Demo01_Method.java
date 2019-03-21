package day01.day01_exercise.SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
         由于DateFormat为抽象类，不能直接使用，所以需要常用的子类 java.text.Day01.SimpleDateFormat 。这个类需要一个
        模式（格式）来指定格式化或解析的标准。构造方法为：

        public Day01.SimpleDateFormat(String pattern) ：用给定的模式和默认语言环境的日期格式符号构造
        Day01.SimpleDateFormat。
        参数pattern是一个字符串，代表日期时间的自定义格式。


        SimpleDateFormat构造方法:

            1.Day01.SimpleDateFormat()
                    用默认的模式和默认语言环境的日期格式符号构造 Day01.SimpleDateFormat。

            2.public Day01.SimpleDateFormat(String pattern)

            用给定的模式和默认语言环境的日期格式符号构造 Day01.SimpleDateFormat。
            注：此构造方法可能不支持所有语言环境。要覆盖所有语言环境，请使用 DateFormat 类中的工厂方法。

参数：


         成员方法:

                1. String format(Day01.Date date)
                        将一个 Day01.Date 格式化为日期/时间字符串。 通常与SimpleDateFormat配合使用,利用继承关系

                2.Day01.Date parse(String text, ParsePosition pos)
                                     解析字符串的文本，生成 Day01.Date
*/
public class Demo01_Method {
    public static void main(String[] args) throws ParseException {
        //创建一个Date对象
        Date d = new Date();
        //DateFormat df = new DateFormat() ;是抽象类,要想使用必须对方法进行覆盖重写所以此时就要考虑DateFormat的子类SimpleDateFormate
        SimpleDateFormat sdf = new SimpleDateFormat();
        String str = sdf.format(d);
        System.out.println(str);//18-10-18 下午3:11
        Date d1 = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd/a HH:mm:ss  ");
        System.out.println(sf.format(d1));
        System.out.println("============================");
        String str1 = "1995/08/23";
        SimpleDateFormat sdf1 = new SimpleDateFormat("YYYY/MM/dd");
        Date parse = sdf1.parse(str1);
        System.out.println(parse);
        System.out.println("==================");



    }
}
