package day10.day10_homework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Test08 {
    public static void main(String[] args) throws IOException {
        /*
        * 描述:
            我有一个文本文件score.txt，我知道数据是键值对形式的，但是不知道内容是什么。
            请写一个程序判断是否有"lisi"这样的键存在，如果有就改变其实为"100"
        * */

        Properties po = new Properties();
       po.load(new FileInputStream("E:\\就业班\\TestCode\\src\\day10.day10_homework\\score.txt"));
        Set<String> keys = po.stringPropertyNames();
        for (String key : keys) {
            if ("lisi".equals(key)) {
                po.setProperty(key, "100");
            }
        }

        po.store(new FileOutputStream("score.txt"),"haha");
        System.out.println(po);
            }
        }


