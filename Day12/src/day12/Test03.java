package day12;

public class Test03 {
    public static void main(String[] args) {
        //创建一个新线程

        new Thread(()->{
            for (int i = 0; i < 10 ; i++) {
                System.out.println("jakjak" + i);
            }
        }).start();

          /*
           对象创建
             new Person()
             (name)->{return new Person(name)}

             Person::new
         */
    }
}
