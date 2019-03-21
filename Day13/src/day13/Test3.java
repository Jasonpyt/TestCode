package day13;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
    反射得到的方法对象
      如何执行。

      原来我们操作
         Student stu = new Student();
          stu.sleep();
      通过反射方式
         方法 叫Method类型
            invoke(Object obj,参数列表)
             第一个参数 调用该方法的那个主体

 */
public class Test3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        //获取字节码文件对象
        Class<?> c = Class.forName("day13.Student01");
        //创建一个字节码对应的实例对象
        Object o = c.newInstance();

        //获取指定空参的公共方法
        Method sleep = c.getMethod("sleep");

        //想要执行这个方法
        Object invoke = sleep.invoke(o);
        System.out.println(invoke);

    }
}
