package day09.day09_exercise;

import java.io.File;
import java.io.IOException;

/*
* - public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
- public boolean delete() ：删除由此File表示的文件或目录。
- public boolean mkdir() ：创建由此File表示的目录。
- public boolean mkdirs() ：创建由此File表示的目录，包括任何必需但不存在的父目录。

* */
public class Test04_DeleteMethod {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\就业班\\TestCode\\src\\day09\\ccc.txt");
//        public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
        System.out.println(file.createNewFile());//ture
        System.out.println("====================================================================");

//        public boolean delete() ：删除由此File表示的文件或目录。
        boolean delete = file.delete();
        System.out.println(delete);//true

//        boolean mkdir = file.mkdir();
//        System.out.println(mkdir);//true


        //public boolean mkdirs() ：创建由此File表示的目录，包括任何必需但不存在的父目
        boolean mkdirs = file.mkdirs();
        System.out.println(mkdirs);//false
    }
}
