package Demo02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test18 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("E:\\就业班\\TestCode\\src\\Demo02\\aa.txt");
        fos.write("改变中国IT教育".getBytes());
        fos.close();
    }
}
