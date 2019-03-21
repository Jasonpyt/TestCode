package day13;

public class Student1 {
   private  String name;


    public Student1() {
    }

    public Student1(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student1 yqw = new Student1("yqw");
        Class<? extends Student1> sclass = yqw.getClass();
        System.out.println(sclass.getName());


    }
}

