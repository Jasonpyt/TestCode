package day02.day02_exercise;
/*
* 泛型:能够保证数据的安全性在编译时就能确定集合中的数据类型在后面对数据的操作中就不用对数据进行向下转型了
*       如果没有泛型后面的操作没有进行向下转型就会报出类型转换异常的错误
* */
public class Test04 {
    public static void main(String[] args) {
    //show("abc");//这样就会报错因为定义的泛型是int类型的包装类Integer
    }
//在方法中引用泛型
  public static <Integer> void show(int i){
      System.out.println(i + 2);
  }

}
