package Demo02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test13 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("E:\\就业班\\TestCode\\src\\Demo02\\测试文件.txt");
        int len;
        char[] chArr = new char[3];
        while((len = fr.read(chArr))!=-1){
            System.out.print(chArr);
        }
        fr.close();
    }
}
