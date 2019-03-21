package day10.day10_excerise;


    class Fu{
        int num = 10;
    }
    class Zi extends Fu {
        int num = 20;

        public void show(){
            int num = 30;
            System.out.println(num);
            System.out.println(new Zi().num);
            System.out.println(new Fu().num);
        }

    }

public class Test03 {

    public static void main(String[] args) {
        new Zi().show();
    }
}
