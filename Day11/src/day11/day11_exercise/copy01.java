package day11.day11_exercise;

import java.io.*;
import java.util.Date;

public class copy01 {
    public static void main(String[] args) throws IOException {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
        FileInputStream fis1 = new FileInputStream("D:\\Study\\java300\\课时01.为什么需要学编程，什么样的人可以做程序员.flv");
        FileOutputStream fos1 = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\接收数据\\001.flv");

        BufferedInputStream bis = new BufferedInputStream(fis1);
        BufferedOutputStream bos = new BufferedOutputStream(fos1);
        int len1 ;
        byte[] bytes1 = new byte[2048];
        while ((len1 = bis.read())!= -1){
            bos.write(bytes1);
        }
        bos.close();
        bis.close();
        long l = System.currentTimeMillis();
        System.out.println(l);
    }
}
