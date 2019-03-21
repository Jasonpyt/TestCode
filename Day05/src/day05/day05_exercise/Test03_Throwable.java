package day05.day05_exercise;

public class Test03_Throwable {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        }catch (Exception e){
           // String message = e.getMessage();//报出异常信息
          //  System.out.println(message);
            //报出具体异常信息
            e.printStackTrace();//java.lang.ArithmeticException: / by zero
                                //at Test03_Throwable.main(Test03_Throwable.java:6)


        }
    }
}
