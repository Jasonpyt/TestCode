package day07.day07_extend;

public class Test03 {
    public static void main(String[] args) {
        Object num = getNum(Math::random);
        System.out.println(num);
    }
    public static Object getNum(MySupplier supplier){
        Object num = supplier.getNum();
        return num;
    }
}
