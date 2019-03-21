package day07.day07_homework;

public class Test09InvokeDirect {
    public static void main(String[] args) {
        invokeDirect(() -> System.out.println("导演拍电影啦！"));
    }
    private static void invokeDirect(Director director) {
        director.makeMovie();
    }
}
