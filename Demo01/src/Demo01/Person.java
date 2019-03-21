package Demo01;
/*
* 自定义人类:
	包含私有成员变量：姓名(String name),年龄(int age),身高属性(double hight).
	生成无参,有参构造方法,生成get/set方法.
* */
public class Person {
    private  String name;
    private  int age;
    private  double hight;

    public Person() {
    }

    public Person(String name, int age, double hight) {
        this.name = name;
        this.age = age;
        this.hight = hight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hight=" + hight +
                '}';
    }
}
