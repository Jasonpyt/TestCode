package day13;

import java.lang.reflect.Constructor;

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
public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
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
    }
}
