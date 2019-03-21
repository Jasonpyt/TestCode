package day13;

public class Stu {
    // 姓名
    private String name;
    // 性别
    private String gender;
    // 年龄
    private int age;

    // public 无参数构造方法
    public Stu() {
        System.out.println("public 修饰无参数构造方法");
    }

    // public 有参数构造方法
    public Stu(String name, String gender, int age) {
        System.out.println("public 修饰有参数构造方法");
        this.name = name;
        this.gender = gender;
        this.age = age;
    }



    // private 有参构造方法
    private Stu(String name, String gender){
        System.out.println("private 修饰构造方法");
        this.name = name;
        this.gender = gender;
    }

    // getter & setter 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 普通方法
    public void sleep(){
        System.out.println("睡觉");
    }

    public void sleep(int hour){
        System.out.println("public修饰---sleep---睡" + hour + "小时");
    }

    private void eat(){
        System.out.println("private修饰---eat方法---吃饭");
    }

    // 静态方法
    public static void study(){
        System.out.println("静态方法---study方法---好好学习Java");
    }

    @Override
    public String toString() {
        return "Student{" +
               "name='" + name + '\'' +
               ", gender='" + gender + '\'' +
               ", age=" + age +
               '}';
    }
}
