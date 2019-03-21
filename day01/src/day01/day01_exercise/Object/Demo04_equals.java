package day01.day01_exercise.Object;
/*
* boolean equals(Day01.Object obj)
          指示其他某个对象是否与此对象“相等”。

equals源码:
            public boolean equals(Day01.Object obj) {
                    return (this == obj);
                }

注意:
        如果没有覆盖重写equals方法，那么Object类中默认进行 == 运算符的对象地址比较，只要不是同一个对象，结果
        必然为false,如果重写之后比较的就是对象中的属性值
* */
public class Demo04_equals {
    public static void main(String[] args) {
        //利用Object创建两个对象obj和obj1
        Object obj = new Object();
        Object obj1 = new Object();
        boolean equals = obj.equals(obj1);
        //输出比较结果
        System.out.println(equals);//false


    }
}
