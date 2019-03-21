package day13;

import java.lang.reflect.InvocationTargetException;

public class Constructor {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取字节码文件
        Class<?> clazz = Class.forName("day13.Person");

        java.lang.reflect.Constructor<?>[] constructors = clazz.getConstructors();//获取所有的public声明的构造方法
        System.out.println(constructors.length);//2

        java.lang.reflect.Constructor<?> constructor = clazz.getConstructor();//获取空参构造方法
        System.out.println(constructor);

            //获取满参构造的方法
        java.lang.reflect.Constructor<?> constructor1 = clazz.getConstructor(String.class);
        System.out.println(constructor1);

        //以上已经得到了空参和无参数构造接下来就可以创建对象了

        Object o = constructor.newInstance();   //创建对象实例
        System.out.println(o);//Person{name='null'}

            //获取满参构造创建的对象
        Object o1 = constructor1.newInstance("张三丰");//Person{name='张三丰'}
        System.out.println(o1);


    }
}
