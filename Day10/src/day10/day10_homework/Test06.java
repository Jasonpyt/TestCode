package day10.day10_homework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test06 {
    public static void main(String[] args) throws IOException {
        /*
        * 描述:利用字节流将E盘下的a.png图片复制到D盘下(文件名保存一致)
            要求
            一次读写一个字节的方式
        * */

        //1.创建读对象
        FileInputStream fis = new FileInputStream("E:\\小姐姐.jpg");
        //创建写对象
        FileOutputStream fos = new FileOutputStream("D:\\小姐姐.jpg");
        //创建暂存字节数组
        byte[] buffer = new byte[1024];
        int len;
        while ((len =fis.read())!= -1){
            System.out.println(new String(buffer,0,len));
            fos.write(len);
        }
        fos.close();
        fis.close();
    }
}
