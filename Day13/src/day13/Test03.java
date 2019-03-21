package day13;

import java.lang.reflect.Method;

/*
   1:获取到一个字节码文件对象
   2：查看一下该字节码文件对象中 有什么成员方法。
Class中
      Method[] getMethods()获取所有公共的成员方法，并把这些方法当做Method对象。
                        包含继承自父类中的公共方法。

      当前类中
        有9个公共方法,一个私有方法。

        成员方法 是根据 方法名 和参数列表 区分的
        找方法的时候 要根据方法名和 参数列表找

       Method getMethod("方法名", 方法的参数类型... 类型)
	     根据方法名和参数类型获得一个方法对象，只能是获取public修饰的

 */
public class Test03 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        //获取字节码对象
        Class<?> clazz = Class.forName("day13.Student01");
        Method[] method = clazz.getMethods();
        for (Method method1 : method) {

            System.out.println(method1);
        }

        System.out.println("==========================================");

        Method sleep = clazz.getMethod("sleep");
        System.out.println(sleep);

        Method sleep1 = clazz.getMethod("sleep", int.class);
        System.out.println(sleep1);

        Method getAge = clazz.getMethod("getAge");
        System.out.println(getAge);

    }
}
