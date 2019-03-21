package day09.day09_exercise;

import java.io.File;

/*
* - public String getAbsolutePath() ：返回此File的绝对路径名字符串。
- public String getPath() ：将此File转换为路径名字符串。
- public String getName()  ：返回由此File表示的文件或目录的名称。
- public long length()  ：返回由此File表示的文件的长度。

- 绝对路径：从盘符开始的路径，这是一个完整的路径。
- 相对路径：相对于项目目录的路径，这是一个便捷的路径，开发中经常使用。

* */
public class Test02_FileMethod {
    public static void main(String[] args) {
        //创建file对象
        File file = new File("day09\\aa.txt");
        //public String getAbsolutePath() ：返回此File的绝对路径名字符串。
        String name = file.getName();
        System.out.println("文件的名称是:" + name);//文件的名称是:aa.txt
        System.out.println("==========================================");
        // public String getAbsolutePath() ：返回此File的绝对路径名字符串。
        String absolutePath = file.getAbsolutePath();
        System.out.println("文件的绝对路径是:" + absolutePath); //E:\就业班\TestCode\day09\aa.txt

        System.out.println("============================================");
        //public String getPath() ：将此File转换为路径名字符串。
        String path = file.getPath();
        System.out.println("文件的初始路径即目的地路径:" + path);//day09\aa.txt
        System.out.println("====================================================");
        //public long length()  ：返回由此File表示的文件的长度。
        long length = file.length();
        System.out.println("文件的长度是:" + length);//0
        System.out.println("===================================================");
        //计算此抽象路径名的哈希码
        int hashcode = file.hashCode();
        System.out.println("文件的哈希值是:" + hashcode);//文件的哈希值是:2121881896
        System.out.println("=======================================================");
        //测试应用程序是否可以执行此抽象路径名表示的文件。
        boolean b = file.canExecute();
        System.out.println("改应用程序能否执行创建的文件:"+b);//false
        System.out.println("============================================================");
        //测试应用程序是否可以读取此抽象路径名表示的文件。
        boolean b1 = file.canRead();
        System.out.println("该文件是否可读:" + b1);//false
        System.out.println("==============================================================");
        //测试应用程序是否可以修改此抽象路径名表示的文件。
        boolean b2 = file.canWrite();
        System.out.println("该文件是否可以被修改:"+ b2);//false
        System.out.println("================================================================");
        int i = file.compareTo(new File("E:\\就业班\\TestCode\\day09\\aa.txt"));
        //如果该参数等于此抽象路径名，则返回零；
        // 如果此抽象路径名在字母顺序上小于该参数，则返回小于零的值；
        // 如果此抽象路径名在字母顺序上大于该参数，则返回大于零的值
        System.out.println(i);//-1
        System.out.println("===================================================================");

    }
}
