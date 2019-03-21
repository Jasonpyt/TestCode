package day03.day03_homework;

import java.util.LinkedHashSet;
import java.util.Scanner;

/*
* 十一、键盘录入一个字符串，去掉其中重复字符，打印出不同的那些字符，
* 必须保证顺序。例如输入：aaaabbbcccddd，打印结果为：abcd。
* */
public class Test11_LinkedHashSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s = scanner.nextLine();
        LinkedHashSet<String> lsh = new LinkedHashSet<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (!lsh.contains(c)){
                lsh.add(c+"");
            }
        }

        for (String lsh1 : lsh) {
            System.out.print(lsh1 );
        }
    }
}
