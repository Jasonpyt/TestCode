package day08.day08_homework;

import jdk.nashorn.internal.objects.annotations.Function;
//1.定义一个函数式接口NumberToString,其中抽象方法String convert(int num)，使用注解@FunctionalInterface
public interface NumberToString {
    @Function
    String convert(int num);
}
