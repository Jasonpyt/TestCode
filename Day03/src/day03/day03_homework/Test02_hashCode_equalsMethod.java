package day03.day03_homework;

public class Test02_hashCode_equalsMethod {
    public static void main(String[] args) {
        System.out.println("简述HashSet去除重复元素的原理:");
        System.out.println(" 哈希值:\n" +
                "    是一个十进制的整数,由操作系统给出(就是对象的地址值,由JVM模拟出来的地址值,不是对象实际存储的物理地址)\n" +
                "\n" +
                "    在Object类有一个方法hashCode,获取对象的哈希值\n" +
                "        int hashCode() 返回该对象的哈希码值。\n" +
                "    hashCode方法的源码:\n" +
                "        public native int hashCode();\n" +
                "        native:说明这个方法调用的是操作系统的方法");
    }
}
