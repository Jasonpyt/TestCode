package day13;
/*
  定义一个注解：Book

- 包含属性：String value()   书名
- 包含属性：double price()  价格，默认值为 100
- 包含属性：String[] authors() 多位作者


  注意：
    当注解中只有一个属性且名称是value，在使用注解时给value属性赋值可以直接给属性值，无论value是单值元素还是数组类型。

    如果注解中除了value属性还有其他属性，且至少有一个属性没有默认值，则在使用注解给属性赋值时，value属性名不能省略.

   @Retention(RetentionPolicy.RUNTIME)
   @Target({ElementType.METHOD})
 */
public @interface Book {
    String value();
    double price();
    String[] authors();
}
