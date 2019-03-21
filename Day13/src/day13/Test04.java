package day13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/*
     要求  读取配置文件中的信息
          最终调用该配置信息中的方法

          解析配置文件中的  类名 和  方法名
          根据类名和方法名去执行。

   */
public class Test04 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        // 1: 创建Properties集合 用来读取配置文件
        Properties pp = new Properties();

        pp.load(new FileInputStream("E:\\就业班\\TestCode\\src\\day13\\pro.properties"));

        // 数据读取到pp中
        // 能不能把类名(类的全路径) 和 方法名 解析出来
        String className = pp.getProperty("className");
        String methodName = pp.getProperty("methodName");

        // 通过反射方式完成
        // 1:获取到字节码文件对象 根据路径获取
        Class clazz = Class.forName(className);

        //2: 通过字节码文件 创建实例
        Object o = clazz.newInstance();

        //3: 找到指定方法
        Method method = clazz.getDeclaredMethod(methodName);

        //4:执行该方法
        method.invoke(o);
    }
}
