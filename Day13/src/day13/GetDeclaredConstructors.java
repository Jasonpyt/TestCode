package day13;

import java.lang.reflect.Constructor;

public class GetDeclaredConstructors {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        //1.获取字节码对象
        Class<?> clazz = Class.forName("day13.Student1");

        //2.获取所有的构造方法(包括任何修饰符修饰的构造方法)
        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
        System.out.println(declaredConstructors);
        System.out.println("===============================================================");
        Constructor<?> declaredConstructor = clazz.getDeclaredConstructor(String.class);
        System.out.println(declaredConstructor);
    }
}
