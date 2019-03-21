package day08.day08_homework;

public class Test04 {
    public static void main(String[] args) {
        Car Q7 = getCar(Car::new);
        Q7.setBrand("奥迪");
        System.out.println(Q7);
    }
    public static Car getCar(BeanFactory<Car> factory){
        return factory.getBean();
    }
}
