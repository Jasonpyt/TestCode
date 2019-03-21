package day01.day01_homework;
/*
* (1)定义数字字符串数组{"010","3223","666","7890987","123123"}；
	(2)判断该数字字符串数组中的数字字符串是否是对称(第一个数字和最后一个数字相等，第二个数字和倒数第二个数字是相等的，依次类推)的，并逐个输出；
	(3)如：010 是对称的，3223 是对称的，123123 不是对称的；
	(4)最终打印该数组中对称字符串的个数。
注：判断对称可用reverse(),将此字符序列用其反转形式取代。
* */
public class Test07 {
    public static void main(String[] args) {
        String[] str = {"010","3223","666","7890987","123123"};
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            sb.append(str[i]);
            StringBuilder reverse = sb.reverse();
            //System.out.println(reverse);
            if (reverse.equals(sb) == true){
                System.out.print(str[i] + " ");
                count++;


            }
        }
        System.out.println();
        System.out.println("符合条件的有" + count + "个");
        }
    }

