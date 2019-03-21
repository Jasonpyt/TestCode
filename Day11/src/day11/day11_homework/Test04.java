package day11.day11_homework;

import java.io.*;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

/*
* 描述:
分析以下需求，并用代码实现
	实现一个验证码小程序，要求如下：
	1. 在项目根目录下新建一个文件：data.txt,键盘录入3个字符串验证码，并存入data.txt中，要求一个验证码占一行；
	2. 键盘录入一个需要被校验的验证码，如果输入的验证码在data.txt中存在：在控制台提示验证成功，如果不存在控制台提示验证失败
* */
public class Test04 {
    public static void main(String[] args) throws IOException {
        //1.在新建的文件data.txt中键盘录入3个字符串验证码,并存入data.txt中要求一个验证码占一行
       BufferedWriter  bw = new BufferedWriter(new FileWriter("E:\\就业班\\TestCode\\src\\day11\\day11_homework\\data.txt"));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <4; i++) {
           Scanner sc = new Scanner(System.in);
           System.out.println("请输入第" + i + "个验证码:"+ "(建议为3个字符)");
           String str = sc.nextLine();
           bw.write(str);
           bw.newLine();
           list.add(str);
       }

       bw.close();
        System.out.println("验证码录入完成!" + "请进行验证码验证:");

        System.out.println("========================================================");

        //键盘录入验证码在数据库中进行验证,如果存在则在控制台显示验证成功,如果不存在就在控制台上提示验证失败
        Scanner sc = new Scanner(System.in);
        System.out.println("请输如需要验证的验证码:");
        String m = sc.nextLine();
        for (String s : list) {
            if (s.contains(m)){
                System.out.println("验证成功!");
                break;
            }else{
                System.out.println("验证失败!");
                break;
            }

        }
        System.out.println("----------------------over-------------------------------------------");
    }
}
