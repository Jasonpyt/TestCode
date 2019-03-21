package day08.day08_homework;

public class Test01 {
    /*
    * 2.在测试类中定义static void decToHex(int num ,NumberToString nts),
    * 该方法的预期行为是使用nts将一个十进制整数转换成十六进制表示的字符串，
    * tips:已知该行为与Integer类中的toHexString方法一致
    * */
    public static void main(String[] args) {
        decToHex(999,Integer ::toHexString);
    }

    static void decToHex(int num ,NumberToString nts){
        String vonvert = nts.convert(num);
        System.out.println(vonvert);
    }

}
