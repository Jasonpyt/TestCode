package day11.day11_homework;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*利用高效字节输出流往C盘下的d.txt文件输出一个字节数*/
public class Test01 {
    public static void main(String[] args) throws IOException {
        //创建高效字节输出流步骤"
        //1.创建基本输出流并关联目标文件
        FileOutputStream fos = new FileOutputStream("E:\\就业班\\TestCode\\src\\day11\\day11_homework\\d.txt");
        //2.创建高效字节输出流将基本输出流引入其中
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //3进行读操作write()
        bos.write('A');
        //4.关闭资源
        bos.close();

    }
}
