package day04.day04_homework;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test08 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("1930年","乌拉圭");
        map.put("1934年","意大利");
        map.put("1938年","法国");
        map.put("1950年","巴西");
        map.put("1954年","瑞士");
        map.put("1958年","瑞典");
        map.put("1962年","智利");
        map.put("1966年","英格兰");
        map.put("1970年","墨西哥");
        map.put("1974年","前西德");
        map.put("1978年","阿根廷");
        map.put("1982年","西班牙");
        map.put("1986年","墨西哥");
        map.put("1990年","意大利");
        map.put("1994年","美国");
        map.put("1998年","法国");
        map.put("2002年","韩日");
        map.put("2006年","德国");
        map.put("2010年","南非");
        map.put("2014年","巴西");

        //输入一个年份
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查询的年份:");
        String str = sc.nextLine();
        System.out.println("请输入一支球队:");
        String str1 = sc.nextLine();
        Set<String> set = map.keySet();
        for (String key: set) {

            if (key.contains(str)) {
                String value = map.get(key);
                System.out.println(value);

                if (value.contains(str1)){
                    System.out.println(key);
                }
            }else{
                break;
            }
        }

        System.out.println("没有参加");

    }
}
