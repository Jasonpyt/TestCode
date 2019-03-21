package day10.day10_excerise;
/*
* 当定义一个变量时如果有方法重载,那么会根据变量类型选择对应的方法,包装类优先选择Objecit
* */
public class Test {
    public static void main(String[] args) {
        //定义一个Integer类型的变量i
        Integer i = 10;
        //调用show方法
        show(i);
    }

    public  static void show(Object obj) {
        System.out.println("obj");
    }
    public  static void show(String obj){
        System.out.println("String");
    }

    public static  void show(int obj){
        System.out.println("int");
    }

}
