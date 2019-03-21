package day11.day11_exercise;

import java.io.*;
import java.util.Date;

public class copy {
    public static void main(String[] args) throws IOException {
        //记录开始时间
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("D:\\Study\\java300\\课时01.为什么需要学编程，什么样的人可以做程序员.flv");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\接收数据\\01.flv");
        //进行读操作
        int len;
        byte[] bytes = new byte[2048];
        while ((len = fis.read(bytes))!= -1){
            fos.write(bytes);

        }
        fos.close();
        fis.close();
        long end = System.currentTimeMillis();
        System.out.println("这个拷贝过程一共花费了" + Math.abs(start-end) + "毫秒");
        System.out.println("=============================================================");

    }


}
