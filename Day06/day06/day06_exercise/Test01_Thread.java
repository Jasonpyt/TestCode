package day06.day06_exercise;

public class Test01_Thread {
    public static void main(String[] args) {
        System.out.println("这里是mian线程");//这里是mian线程
        MyThread mt = new MyThread("小强");
        mt.start();//开启线程
        for (int i = 0; i < 20; i++) {
            System.out.println("旺财" + i);
        }
    }
}

class MyThread extends Thread{
    /*
    * 利用继承中的特点
    * 将线程名称传递,进行设置
    *
    * */

    public MyThread(String name) {
        super(name);
    }

    /*
    * 重写run方法
    * 定义线程要执行的代码
    * */

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            //getName()方法来自父类
            System.out.println(getName() + i);
        }
    }
}
