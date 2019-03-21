package day13;

import java.lang.reflect.Method;

/*
   1:获取到一个字节码文件对象
   2：查看一下该字节码文件对象中 有什么成员方法。
Class中
     找到该类中定义的所有的方法
       Method[] methods = clazz.getDeclaredMethods();

      当前类中
        有9个公共方法,一个私有方法。

        成员方法 是根据 方法名 和参数列表 区分的
        找方法的时候 要根据方法名和 参数列表找


 */
public class Test003 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        //获取字节码文件对象
        Class<?> clazz = Class.forName("day13.Student01");

        Method eat = clazz.getDeclaredMethod("eat");
        System.out.println(eat);
    }
}
