package day01.day01_exercise.Integer;

public class Demo01 {
    public static void main(String[] args) {
        //基本数值转换为包装类即装箱过程
        Integer num = new Integer(4);
        //也可以使用包装类的valueof方法
        Integer i = Integer.valueOf(10);
        System.out.println(num);
        System.out.println(i);
        System.out.println("=========================");
        //包装类转换为基本数据类型
        int in = i;
        System.out.println(i);
        //使用intValue方法
        int i1 = i.intValue();
        System.out.println(i1);

        /*
        * String转换成基本类型

除了Character类之外，其他所有包装类都具有parseXxx静态方法可以将字符串参数转换为对应的基本类型：

- public static byte parseByte(String s)：将字符串参数转换为对应的byte基本类型。
- public static short parseShort(String s)：将字符串参数转换为对应的short基本类型。
- public static int parseInt(String s)：将字符串参数转换为对应的int基本类型。
- public static long parseLong(String s)：将字符串参数转换为对应的long基本类型。
- public static float parseFloat(String s)：将字符串参数转换为对应的float基本类型。
- public static double parseDouble(String s)：将字符串参数转换为对应的double基本类型。
- public static boolean parseBoolean(String s)：将字符串参数转换为对应的boolean基本类型。

        * */
        //将基本数据类型转换为字符串,以int类型为例
        int i2 = 100;
        //直接通过加一个空字符串进行转换
        String s = 100 + " ";
        System.out.println(s);//此时获取的就是字符串100

        //字符串转换为基本数据类型
        String s3 = "123";

        //以Integer类的静态方法parseXxx
        int i3 = Integer.parseInt(s3);
        System.out.println(i3 + 100);
    }

}
