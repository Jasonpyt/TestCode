package day10.day10_excerise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test05 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流 并关联源文件
        FileInputStream fis = new FileInputStream("E:\\就业班\\TestCode\\src\\day10\\a.txt");


        /*
             不知道次数 用while
             结束条件  如果读取的结果是-1 结束循环
             成立的条件  读取的结果不等于-1
             while(返回的结果与-1){

             }
             */
        int b;
            while ( (b =fis.read()) != -1) {
                // 执行读取操作
                System.out.println((char) (b));
            }

        System.out.println("===========================");
//
//            while ((fis.read())!= -1){
//                System.out.println(fis.read()); //不能使用这种写法只会遍历一个
//            }
        //释放资源
        fis.close();
    }
}
