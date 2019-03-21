package day07.day07_homework;

public class Test11 {

    public static void main(String[] args) {
        showLongTime(( ) -> System.out.println(System.currentTimeMillis()) );
    }

    static void showLongTime(CurrentTimePrinter timePrinter){
    timePrinter.printCurrentTime();
    }
}
