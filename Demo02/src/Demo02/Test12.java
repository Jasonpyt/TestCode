package Demo02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test12 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\就业班\\TestCode\\src\\Demo02\\a.txt");
        int temp;
        while((temp = fis.read())!= -1){
            System.out.println(temp);
        }
        fis.close();
    }
}
