package Demo02;

import java.io.File;

public class Test04 {
    public static void main(String[] args) {
        File file1 = new File("D:\\aaa.txt");
        //File file2 = new File(new File(“a.txt”));
        File file3 = new File("D:\\aaa", "bbb.txt");
        File file4 = new File( "bbb.txt","D:\\aaa");
    }
}
