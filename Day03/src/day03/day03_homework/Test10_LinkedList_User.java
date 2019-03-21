package day03.day03_homework;

import java.util.Iterator;
import java.util.LinkedList;

/*
* 十、已知数组存放一批QQ号码，QQ号码最长为11位，
* 最短为5位String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"}。
将该数组里面的所有qq号都存放在LinkedList中，将list中重复元素删除，将list中所有元素分别用迭代器和增强for循环打印出来。
* */
public class Test10_LinkedList_User {
    public static void main(String[] args) {
        String[] strs = {"12345", "67891", "12347809933", "98765432102", "67891", "12347809933"};
        LinkedList<String> list = new LinkedList<>();
        for (String s : strs) {
            if (!list.contains(s)) {
                list.add(s);
            }
        }
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("==================");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }
    }


        }






