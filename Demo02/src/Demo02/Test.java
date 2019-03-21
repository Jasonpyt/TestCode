package Demo02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要检索的球员姓名:");
        String message = sc.nextLine();
        FileReader fr = new FileReader("E:\\就业班\\TestCode\\src\\Demo02\\player.txt");
        Properties pro = new Properties();
        pro.load(fr);
        String name = pro.getProperty(message);
        if (name != null){


            System.out.println(name);
        }else {
            System.out.println("没这个球员");
        }


    }
}
