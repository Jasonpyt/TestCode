package day01.day01_exercise.Object;
/*
* String toString()
          返回该对象的字符串表示

   toString()源码
              public String toString() {
                    return getClass().getName() + "@" + Day01.Integer.toHexString(hashCode());

             分析:
                左边:类名
                中间:@
                右边:hashCode的十六进制表现形式
                这么写没有意义

      toString方法作用:
                       方便的显示属性值

      注意:
            如果直接打印对象的引用,会默认调用toString方法
            由于toString方法返回的结果是内存地址，而在开发中，经常需要按照对象的属性得到相应的字符串表现形式，因
            此也需要重写它。
    }
* */
public class Demo03toString {
    public static void main(String[] args) {
        //利用Object构造方法创建obj对象
        Object obj = new Object();
        //用toString方法将对象转为字符串
        String string = obj.toString();
        //打印这个字符串
        System.out.println(string);//java.lang.Day01.Object@1540e19d
    }
}
