package day01.day01_homework;

public class Test06 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append(i);
        }
        long end = System.currentTimeMillis();
        long time = (end - start);
        System.out.println(time);
    }
}
