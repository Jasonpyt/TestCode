package day09.day09_homework;

import java.io.File;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\a.txt");
        file.createNewFile();
    }
}
