package day10.day10_excerise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test09 {
    public static void main(String[] args) throws IOException {
        //1:创建字节输入流关联源文件。
        FileInputStream fis = new FileInputStream("E:\\就业班\\TestCode\\src\\day10\\小姐姐.jpg");
        //创建字节输出流关联目的地
        FileOutputStream fos = new FileOutputStream("E:\\就业班\\TestCode\\src\\day10\\img\\sister.jpg");
        //读取源文件中的数据到目的地
        byte[] buffer = new byte[1024];
        int len;
        while((len = fis.read(buffer)) != -1){
            System.out.println(new String(buffer,0,len));
        }
        //释放资源
        fos.close();
        fis.close();
    }
}
