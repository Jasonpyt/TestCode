package day10.day10_excerise;

import java.util.Properties;
import java.util.Set;

public class Test10 {
    public static void main(String[] args) {
        //创建一个集合对象
        Properties po = new Properties();
        po.setProperty("阿拉斯加","德鲁伊");
        po.setProperty("沙皮","伊泽瑞尔");
        Set<String> key = po.stringPropertyNames();
        for (String s : key) {
            String value = po.getProperty(s);
            System.out.println(key + value);
        }

        System.out.println("==============================");

        }
    }

