package day09.day09_homework;

import java.io.File;

public class Test03 {
    public static void main(String[] args) {
        File file = new File("D:\\bbb");
        boolean mkdir = file.mkdir();
        System.out.println(mkdir);
    }
}
