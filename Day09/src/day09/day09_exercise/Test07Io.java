package day09.day09_exercise;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test07Io {
    public static void main(String[] args) throws IOException {
        //创建io对象
        FileOutputStream fos = new FileOutputStream("fos.txt");
        //写内容
        fos.write('a');
        fos.write('b');
        fos.close();
        FileOutputStream fos1 = new FileOutputStream("fos.txt", true);
        fos1.write('c');//添加成功就是你在后面进行累加,如果不成功就会覆盖原来在文件中的内容
        fos1.write('d');
        byte[] b = {'A','B','C'};
        fos1.write(b,1,1);
        fos1.close();


    }
}
