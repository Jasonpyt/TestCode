package day08.day08_exercise;

import java.util.function.Function;

/*
   类 构造的方法引用
      lambda  n->new 类名(n)

      方法引用
      类名::new
 */
public class Test07 {
    public static void main(String[] args) {
        String name = "张三";
        Person person = createPerson(Person::new, name);
        System.out.println(person);
        String s = "李四";
        Person person1 = createPerson((String n) -> {
            return new Person(s);
        }, s);
        System.out.println(person1);

        String str = "王五";
        Person person2 = createPerson((String s1) -> {
            return new Person(name);
        }, str);
        System.out.println(person2);
    }
    public static Person createPerson(Function<String,Person>function,String name){
        Person apply = function.apply(name);
        return apply;
    }
}
