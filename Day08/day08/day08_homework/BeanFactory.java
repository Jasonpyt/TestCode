package day08.day08_homework;

@FunctionalInterface
public interface BeanFactory<T> {
    T getBean();
}
