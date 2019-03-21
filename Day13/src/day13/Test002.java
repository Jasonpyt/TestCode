package day13;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
     Class是字节码对象，该对象中包含了构造方法，成员方法，成员变量。
     那么在这里这些构造就变成了Constructor对象，
                 成员方法就变成Method对象，
                 成员变量就称Field对象。

      如何得到构造的那个对象呢？

      Class中
         Constructor[] getConstructors()
         	获取所有的public修饰的构造方法

 */
public class Test002 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取字节码对象
        Class<?> clazz = Class.forName("day13.Stu");

        //获取所有的构造方法
        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
        System.out.println(declaredConstructors.length);

        //遍历获取的所有构造方法
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        System.out.println("========================================");
        //获取所有的public修饰的构造方法
        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor<?> constructor : constructors) {

            System.out.println(constructor);

            System.out.println("=====================================");

            //通过私有的构造方法创建对象

            Constructor<?> constructor1 = clazz.getConstructor(String.class, String.class, int.class);
            System.out.println(constructor1);
        }

        //通过private修饰的构造方法传递参数
        Constructor<?> declaredConstructor = clazz.getDeclaredConstructor(String.class, String.class, int.class);


        //通过创建的对象实例进行传参数
        Object o1 = declaredConstructor.newInstance("李小龙", "男", 18);

        System.out.println(o1);

        System.out.println("================================");


        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, String.class);
        constructor.setAccessible(true);
        Object o = constructor.newInstance("张小凡", "男");
        System.out.println(o);
    }
}
