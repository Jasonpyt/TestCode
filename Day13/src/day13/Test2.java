package day13;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test2 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取字节码对象
        Class<Stu> stuClass = Stu.class;
        //找到空参构造
        Constructor<Stu> con1= stuClass.getConstructor();

        //在反射情况下创建对象实例
        Stu stu = con1.newInstance();

        //将上面的两步化为一步
        Stu stu1 = con1.newInstance();
        System.out.println(stu1);

    }
}
