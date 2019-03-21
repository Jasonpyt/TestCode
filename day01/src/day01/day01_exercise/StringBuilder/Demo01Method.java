package day01.day01_exercise.StringBuilder;

public class Demo01Method {
    public static void main(String[] args) {
        //字符串的拼接问题
        String s = "Hello";
        s+= "word";
        System.out.println(s);//HelloWord这样进行字符串拼接的问题是占用内存大,影响效率

            //StringBuilder的两个构造方法
            //public Day01.StringBuilder();构造一个空的StringBuilder容器
            //public Day01.StringBuilder(String s);构造一个StringBuilder容器，并将字符串添加进去

        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(true);
        sb.append(100);
        //将StringBuilder转换为String类型
        String string = sb.toString();
        System.out.println(string);//Hellotrue100

        // 这种时候，我们就可以把代码现在一起，如append方法一样，代码如下
        //链式编程
        String s2 = sb.append("hello").append(true).append(100).toString();
        System.out.println(s2);//Hellotrue100hellotrue100
    }
}
