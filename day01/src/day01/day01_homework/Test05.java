package day01.day01_homework;

public class Test05 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        //System.out.println(startTime);
        String str = " ";
        for (int i = 0; i < 100000; i++) {
            str += i;
            //System.out.println(str);
        }
        long endTime = System.currentTimeMillis();
        long useTime =((endTime - startTime)/1000) ;

        System.out.println(useTime+ "秒");


    }
}
