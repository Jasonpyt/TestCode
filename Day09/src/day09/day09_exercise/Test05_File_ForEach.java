package day09.day09_exercise;
/*
* - public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。

- public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。

* */
import java.io.File;
import java.util.Date;

public class Test05_File_ForEach {
    public static void main(String[] args) {
        File file = new File("E:\\就业班\\TestCode\\src\\day09");
        String[] list = file.list();////获取当前目录下的文件以及文件夹的名称。
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("========================================");
        File[] files = file.listFiles();// //获取当前目录下的文件以及文件夹对象，只要拿到了文件对象，那么就可以获取更多信息
        for (File file1 : files) {
            System.out.println(file);
            long l = file.lastModified();
            System.out.println(new Date(l));
        }
    }
}
