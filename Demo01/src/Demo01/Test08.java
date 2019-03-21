package Demo01;

import java.util.ArrayList;

/*
* 定义一个方法filterChars(ArrayList<String> list)
* 将传入的ArrayList<String>集合中的每个元素中的字母过滤掉,比如list有2个元素{"hello123java", "11world555java"}，返回结果{"123", "11555"}

 * */
public class Test08 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello123java");
        list.add("11world555java");
        ArrayList<String> strs = filterChars(list);
        System.out.println(strs);
    }
    public static ArrayList<String> filterChars(ArrayList<String>list){
        ArrayList<String> strs = new ArrayList<>();
        String str = "";
        for (String s : list) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (!('a' <= c && c <= 'z')){
                    str += c;
                }
            }
            strs.add(str);
            str = "";
        }
        return strs;
    }
}
