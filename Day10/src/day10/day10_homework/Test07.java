package day10.day10_homework;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) throws IOException {
        /*项目需求：请用户从控制台输入信息，
        程序将信息存储到文件Info.txt中。可以输入多条信息，每条信息存储一行。当用户输入：”886”时，程序结束。
        *
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一条信息:");
        String inputMessage = sc.nextLine();



        String s ="886";
        if (inputMessage.equals(s)){
            System.out.println("程序结束");
        }else {
            FileWriter fw = new FileWriter("D:\\Info.txt",true);

            fw.write(inputMessage + "\r\n");
            fw.close();
        }

        }



    }

