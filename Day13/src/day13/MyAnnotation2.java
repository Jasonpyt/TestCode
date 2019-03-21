package day13;
/*
   自定义一个注解
     并定义属性

        属性定义规则
          属性的作用

              可以让用户在使用注解时传递参数，让注解的功能更加强大。

          注解的属性的格式

            - 格式1：数据类型 属性名();
                如果使用格式1  使用的时候 必须给该属性赋值

                @MyAnnotation(name="一个值")

            - 格式2：数据类型 属性名() default 默认值;
                  如果使用格式2  使用的时候 可以不给该属性赋值，因为该属性有默认的值


 */
public @interface MyAnnotation2 {
    String name();
    int age() default 10;

}
