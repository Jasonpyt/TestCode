package day01.day01_exercise.Object;
/*
* Class<?> getClass()     返回此 Day01.Object 的运行时类。
* */
public class Demo02_getClass {
    public static void main(String[] args) {
        //利用Object类的构造方法创建对象obj
        Object obj = new Object();
        //利用getClass()方法获取该对象的字节码文件
        Class  gc = obj.getClass();
        //利用Class类的getName()方法获取该对象的名称
        String name = gc.getName();
        //打印对象名称
        System.out.println(name);   //java.lang.Day01.Object
    }
}
