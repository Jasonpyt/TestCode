package day11.day11_exercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test04 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("E:\\就业班\\TestCode\\src\\day11\\a.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("IG Victory");
        bw.newLine();
        bw.write("FNC垃圾");
        bw.close();
    }
}
