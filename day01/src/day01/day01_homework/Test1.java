package day01.day01_homework;
/*
* 一、简述String类中的equals方法与Object类中的equals方法的不同点。
* */
public class Test1 {
    public static void main(String[] args) {
        //String类的equals方法
        String s1 = new String("abc");
        String s2 = "abc";
        System.out.println(s1.equals(s2));//true对String的内容进行比较
        //Object中的equals的方法
        Object obj = new Object();
        Object obj1 = new Object();
        boolean equals = obj.equals(obj1);
        System.out.println(equals);//false 是对地址值进行比较

        System.out.println("总结:");
        System.out.println("在String中的equals中的方法和Object类中的方法比较的对象不同" +
                "String中比较的是对象的内容,相当于重写了Object中的equals中的方法,而Object类中的equals是对地址进行比较的");
    }
}
