package day08.day08_homework;

public class Test05 {
    public static void main(String[] args) {
        getintarray(5,Integer[]::new);
    }
    private static void getintarray(int length,ArrayBuilder<Integer>builder){
        Integer[] array= builder.buildArray(length);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
