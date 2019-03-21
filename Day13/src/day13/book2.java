package day13;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface book2 {
    String value();//书名
    double price() default  100;//价格,默认值为100
    String[] authors();//多位作者


}
